/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import daos.exceptions.NonexistentEntityException;
import entities.Articles;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Registrations;
import entities.Comments;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DELL
 */
public class ArticlesDAO implements Serializable {

    public ArticlesDAO() {
    }
    private EntityManager em = null;

    public void closeEntityManager() throws Exception {
        if (em != null) {
            em.close();
        }
    }

    public void create(Articles articles) throws Exception {
        try {
            em = MyEntityManager.getEntityManager();
            em.getTransaction().begin();
            em.persist(articles);
            em.getTransaction().commit();
        } finally {
            closeEntityManager();
        }
    }

    public Articles findArticle() throws NonexistentEntityException, Exception {
        Articles articles = null;
        try {
            em = MyEntityManager.getEntityManager();
            em.getTransaction().begin();
            articles = (Articles) em.createNamedQuery("Articles.findById").getSingleResult();
            em.getTransaction().commit();

        } catch (Exception e) {

        }
        return articles;
    }

    public boolean edit(Articles articles) throws NonexistentEntityException, Exception {
        boolean check = false;
        try {
            em = MyEntityManager.getEntityManager();
            em.getTransaction().begin();
            // get persitent article
            Articles persitentArticle = (Articles) em.createNamedQuery("Articles.findById").getSingleResult();
            if (persitentArticle != null) {
                em.merge(articles);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {

        } finally {
            if (em != null) {
                em.close();
            }
        }
        return check;
    }

    public List<Articles> getArticles(int maxResult, int pageIndex) throws Exception {
        List<Articles> list = null;
        try {
            em = MyEntityManager.getEntityManager();
            list = em.createNamedQuery("Articles.findAll", Articles.class)
                    .setMaxResults(maxResult)
                    .setFirstResult(maxResult * (pageIndex - 1)).getResultList();
        } finally {
            closeEntityManager();
        }
        return list;
    }
     public List<String> getStatus() throws Exception {
        List<String> list = null;
        try {
            em = MyEntityManager.getEntityManager();
            list = em.createNamedQuery("Articles.getStatus", String.class).getResultList();
        } finally {
            closeEntityManager();
        }
        return list;
    }
     public Integer getSize() throws Exception {
        Integer size = null;
        try {
            em = MyEntityManager.getEntityManager();
            Object obj = em.createNamedQuery("Articles.getSize").getSingleResult();
            size = Integer.parseInt(obj.toString());
        } finally {
            closeEntityManager();
        }
        return size;
    }

}
