/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import daos.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Articles;
import entities.Comments;
import entities.Registrations;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author DELL
 */
public class CommentsJpaController implements Serializable {

    public CommentsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Comments comments) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Articles articleId = comments.getArticleId();
            if (articleId != null) {
                articleId = em.getReference(articleId.getClass(), articleId.getId());
                comments.setArticleId(articleId);
            }
            Registrations registrationId = comments.getRegistrationId();
            if (registrationId != null) {
                registrationId = em.getReference(registrationId.getClass(), registrationId.getEmail());
                comments.setRegistrationId(registrationId);
            }
            em.persist(comments);
            if (articleId != null) {
                articleId.getCommentsList().add(comments);
                articleId = em.merge(articleId);
            }
            if (registrationId != null) {
                registrationId.getCommentsList().add(comments);
                registrationId = em.merge(registrationId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Comments comments) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Comments persistentComments = em.find(Comments.class, comments.getId());
            Articles articleIdOld = persistentComments.getArticleId();
            Articles articleIdNew = comments.getArticleId();
            Registrations registrationIdOld = persistentComments.getRegistrationId();
            Registrations registrationIdNew = comments.getRegistrationId();
            if (articleIdNew != null) {
                articleIdNew = em.getReference(articleIdNew.getClass(), articleIdNew.getId());
                comments.setArticleId(articleIdNew);
            }
            if (registrationIdNew != null) {
                registrationIdNew = em.getReference(registrationIdNew.getClass(), registrationIdNew.getEmail());
                comments.setRegistrationId(registrationIdNew);
            }
            comments = em.merge(comments);
            if (articleIdOld != null && !articleIdOld.equals(articleIdNew)) {
                articleIdOld.getCommentsList().remove(comments);
                articleIdOld = em.merge(articleIdOld);
            }
            if (articleIdNew != null && !articleIdNew.equals(articleIdOld)) {
                articleIdNew.getCommentsList().add(comments);
                articleIdNew = em.merge(articleIdNew);
            }
            if (registrationIdOld != null && !registrationIdOld.equals(registrationIdNew)) {
                registrationIdOld.getCommentsList().remove(comments);
                registrationIdOld = em.merge(registrationIdOld);
            }
            if (registrationIdNew != null && !registrationIdNew.equals(registrationIdOld)) {
                registrationIdNew.getCommentsList().add(comments);
                registrationIdNew = em.merge(registrationIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = comments.getId();
                if (findComments(id) == null) {
                    throw new NonexistentEntityException("The comments with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Comments comments;
            try {
                comments = em.getReference(Comments.class, id);
                comments.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The comments with id " + id + " no longer exists.", enfe);
            }
            Articles articleId = comments.getArticleId();
            if (articleId != null) {
                articleId.getCommentsList().remove(comments);
                articleId = em.merge(articleId);
            }
            Registrations registrationId = comments.getRegistrationId();
            if (registrationId != null) {
                registrationId.getCommentsList().remove(comments);
                registrationId = em.merge(registrationId);
            }
            em.remove(comments);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Comments> findCommentsEntities() {
        return findCommentsEntities(true, -1, -1);
    }

    public List<Comments> findCommentsEntities(int maxResults, int firstResult) {
        return findCommentsEntities(false, maxResults, firstResult);
    }

    private List<Comments> findCommentsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Comments.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Comments findComments(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Comments.class, id);
        } finally {
            em.close();
        }
    }

    public int getCommentsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Comments> rt = cq.from(Comments.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
