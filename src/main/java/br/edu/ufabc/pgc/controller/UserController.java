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

import br.edu.ufabc.pgc.dao.UserDAO;
import br.edu.ufabc.pgc.model.User;

@RestController
public class UserController {
    
    private UserDAO uDAO = null;
    
    public UserController() {
        this.uDAO = new UserDAO();
    }
    
    @RequestMapping(value="/user/{id}", method=RequestMethod.GET, produces="application/json")
    public User listOne(@PathVariable("id") String id) {
        User user = uDAO.find(Long.parseLong(id));
        return user;
    }
    
    @RequestMapping(value="/user", method=RequestMethod.GET, produces="application/json")
    public List<User> listAll() {
        List<User> users = uDAO.findAll();
        return users;
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody User user) {
        uDAO.save(user);
    }
    
    @RequestMapping(value="/user", method=RequestMethod.DELETE)
    public void delete(String id) {
        User user = uDAO.find(Long.parseLong(id));
        uDAO.delete(user);
    }
    
}
