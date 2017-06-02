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

import br.edu.ufabc.pgc.dao.NotificationDAO;
import br.edu.ufabc.pgc.model.Notification;

@RestController
public class NotificationController {
    
    private NotificationDAO nDAO = null;
    
    public NotificationController() {
        this.nDAO = new NotificationDAO();
    }
    
    @RequestMapping(value="/notification/{id}", method=RequestMethod.GET, produces="application/json")
    public Notification listOne(@PathVariable("id") String id) {
        Notification notification = nDAO.find(Long.parseLong(id));
        return notification;
    }
    
    @RequestMapping(value="/notification", method=RequestMethod.GET, produces="application/json")
    public List<Notification> listAll() {
        List<Notification> notification = nDAO.findAll();
        return notification;
    }
    
    @RequestMapping(value="/notification", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Notification notification) {
        nDAO.save(notification);
    }
    
    @RequestMapping(value="/notification/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Notification notification = nDAO.find(Long.parseLong(id));
        nDAO.delete(notification);
    }
    
}
