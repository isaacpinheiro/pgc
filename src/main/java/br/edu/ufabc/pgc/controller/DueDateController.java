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

import br.edu.ufabc.pgc.dao.DueDateDAO;
import br.edu.ufabc.pgc.model.DueDate;

@RestController
public class DueDateController {
    
    private DueDateDAO dDAO = null;
    
    public DueDateController() {
        this.dDAO = new DueDateDAO();
    }
    
    @RequestMapping(value="/duedate/{id}", method=RequestMethod.GET, produces="application/json")
    public DueDate listOne(@PathVariable("id") String id) {
        DueDate dueDate = dDAO.find(Long.parseLong(id));
        return dueDate;
    }
    
    @RequestMapping(value="/duedate", method=RequestMethod.GET, produces="application/json")
    public List<DueDate> listAll() {
        List<DueDate> dueDate = dDAO.findAll();
        return dueDate;
    }
    
    @RequestMapping(value="/duedate", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody DueDate dueDate) {
        dDAO.save(dueDate);
    }
    
    @RequestMapping(value="/duedate/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        DueDate dueDate = dDAO.find(Long.parseLong(id));
        dDAO.delete(dueDate);
    }
    
}
