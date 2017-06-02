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
import br.edu.ufabc.pgc.model.VerificacaoCertificado;

public class VerificacaoCertificadoDAO {
    
    private final EntityManager em;
    
    public VerificacaoCertificadoDAO() {
        this.em = EntityManagerUtil.getEntityManager();
    }
    
    public VerificacaoCertificado find(Long id) {
        
        VerificacaoCertificado obj = null;
        
        try {
            obj = em.find(VerificacaoCertificado.class, id);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
    public void save(VerificacaoCertificado obj) {
        
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
    
    public void delete(VerificacaoCertificado obj) {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public List<VerificacaoCertificado> findAll() {
        
        List<VerificacaoCertificado> obj = null;
        
        try {
            obj = em.createQuery("select t from VerificacaoCertificado t").getResultList();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return obj;
        
    }
    
}
