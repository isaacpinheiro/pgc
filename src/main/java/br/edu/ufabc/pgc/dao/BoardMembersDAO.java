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
import br.edu.ufabc.pgc.model.BoardMembers;

public class BoardMembersDAO {
    
    private final EntityManager em;
    
    public BoardMembersDAO() {
        this.em = EntityManagerUtil.getEntityManager();
    }
    
    public BoardMembers find(Long id) {
        
        BoardMembers obj = null;
        
        try {
            obj = em.find(BoardMembers.class, id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
    public void save(BoardMembers obj) {
        
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
    
    public void delete(BoardMembers obj) {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public List<BoardMembers> findAll() {
        
        List<BoardMembers> obj = null;
        
        try {
            obj = em.createQuery("select t from BoardMembers t").getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
}
