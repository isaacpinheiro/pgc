/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.pgc.controller;

/**
 *
 * @author isaac
 */

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.ufabc.pgc.dao.SessionDAO;
import br.edu.ufabc.pgc.model.Session;

@RestController
public class SessionController {
    
    private SessionDAO sDAO = null;
    
    public SessionController() {
        this.sDAO = new SessionDAO();
    }
    
    @RequestMapping(value="/session/{id}", method=RequestMethod.GET, produces="application/json")
    public Session listOne(@PathVariable("id") String id) {
        Session session = sDAO.find(Long.parseLong(id));
        return session;
    }
    
    @RequestMapping(value="/session", method=RequestMethod.GET, produces="application/json")
    public List<Session> listAll() {
        List<Session> session = sDAO.findAll();
        return session;
    }
    
    @RequestMapping(value="/session", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Session session) {
        sDAO.save(session);
    }
    
    @RequestMapping(value="/session/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Session session = sDAO.find(Long.parseLong(id));
        sDAO.delete(session);
    }
    
}
