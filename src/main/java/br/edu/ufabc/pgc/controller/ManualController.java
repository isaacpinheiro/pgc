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

import br.edu.ufabc.pgc.dao.ManualDAO;
import br.edu.ufabc.pgc.model.Manual;

@RestController
public class ManualController {
    
    private ManualDAO mDAO = null;
    
    public ManualController() {
        this.mDAO = new ManualDAO();
    }
    
    @RequestMapping(value="/manual/{id}", method=RequestMethod.GET, produces="application/json")
    public Manual listOne(@PathVariable("id") String id) {
        Manual manual = mDAO.find(Long.parseLong(id));
        return manual;
    }
    
    @RequestMapping(value="/manual", method=RequestMethod.GET, produces="application/json")
    public List<Manual> listAll() {
        List<Manual> manual = mDAO.findAll();
        return manual;
    }
    
    @RequestMapping(value="/manual", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Manual manual) {
        mDAO.save(manual);
    }
    
    @RequestMapping(value="/manual/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Manual manual = mDAO.find(Long.parseLong(id));
        mDAO.delete(manual);
    }
    
}
