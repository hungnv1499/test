/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import daos.exceptions.NonexistentEntityException;
import daos.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entities.Articles;
import java.util.ArrayList;
import java.util.List;
import entities.Comments;
import entities.Registrations;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.RollbackException;

/**
 *
 * @author DELL
 */
public class RegistrationDAO implements Serializable {

    public RegistrationDAO() {
    }
    private EntityManager em = null;

    public void closeEntityManager() throws Exception {
        if (em != null) {
            em.close();
        }
    }
    public void create(Registrations registrations) throws Exception {
        try {
            em = MyEntityManager.getEntityManager();
            em.getTransaction().begin();
            em.persist(registrations);
            em.getTransaction().commit();
        }finally {
            closeEntityManager();
        }
    }

    public Registrations findById(String id) throws Exception {
        Registrations registrations = null;
        try {
            em = MyEntityManager.getEntityManager();
            registrations = (Registrations) em.createNamedQuery("Registrations.findByEmail").setParameter("email", id)
                    .getSingleResult();
        } catch (NoResultException ex) {
            registrations = null;
        } finally {
            closeEntityManager();
        }
        return registrations;
    }
    public Registrations login(String email, String password) throws Exception {
        Registrations registrations = null;
        try {
            em = MyEntityManager.getEntityManager();
            registrations = (Registrations) em.createNamedQuery("Registrations.login").setParameter("email", email)
                    .setParameter("password", password)
                    .getSingleResult();
        } catch (NoResultException ex) {
            registrations = null;
        } finally {
            closeEntityManager();
        }
        return registrations;
    }
    
    public void edit(Registrations registrations) throws Exception {
        try {
            em = MyEntityManager.getEntityManager();
            em.getTransaction().begin();
            em.merge(registrations);
            em.getTransaction().commit();
        } finally{
            closeEntityManager();
        }
    }

    public void destroy(String id) throws NonexistentEntityException {

    }

}
