/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.pgc.dao;

/**
 *
 * @author isaac
 */

import java.util.List;
import java.util.Date;
import javax.persistence.EntityManager;

import br.edu.ufabc.pgc.util.EntityManagerUtil;
import br.edu.ufabc.pgc.model.Evaluation;

public class EvaluationDAO {
    
    private final EntityManager em;
    
    public EvaluationDAO() {
        this.em = EntityManagerUtil.getEntityManager();
    }
    
    public Evaluation find(Long id) {
        
        Evaluation obj = null;
        
        try {
            obj = em.find(Evaluation.class, id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
    public void save(Evaluation obj) {
        
        Date d = new Date();
        
        if (obj.getId() == null) {
            obj.setCreatedAt(d);
            obj.setUpdatedAt(obj.getCreatedAt());
        } else {
            obj.setUpdatedAt(d);
        }
        
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void delete(Evaluation obj) {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public List<Evaluation> findAll() {
        
        List<Evaluation> obj = null;
        
        try {
            obj = em.createQuery("select t from Evaluation t").getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
}
