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
import br.edu.ufabc.pgc.model.Arquivo;

public class ArquivoDAO {
    
    private final EntityManager em;
    
    public ArquivoDAO() {
        this.em = EntityManagerUtil.getEntityManager();
    }
    
    public Arquivo find(Long id) {
        
        Arquivo obj = null;
        
        try {
            obj = em.find(Arquivo.class, id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
    public void save(Arquivo obj) {
        
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
    
    public void delete(Arquivo obj) {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public List<Arquivo> findAll() {
        
        List<Arquivo> obj = null;
        
        try {
            obj = em.createQuery("select t from Arquivo t").getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
}
