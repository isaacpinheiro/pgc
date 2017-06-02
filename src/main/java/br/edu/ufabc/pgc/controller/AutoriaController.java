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

import br.edu.ufabc.pgc.dao.AutoriaDAO;
import br.edu.ufabc.pgc.model.Autoria;

@RestController
public class AutoriaController {
    
    private AutoriaDAO aDAO = null;
    
    public AutoriaController() {
        this.aDAO = new AutoriaDAO();
    }
    
    @RequestMapping(value="/autoria/{id}", method=RequestMethod.GET, produces="application/json")
    public Autoria listOne(@PathVariable("id") String id) {
        Autoria autoria = aDAO.find(Long.parseLong(id));
        return autoria;
    }
    
    @RequestMapping(value="/autoria", method=RequestMethod.GET, produces="application/json")
    public List<Autoria> listAll() {
        List<Autoria> autoria = aDAO.findAll();
        return autoria;
    }
    
    @RequestMapping(value="/autoria", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Autoria autoria) {
        aDAO.save(autoria);
    }
    
    @RequestMapping(value="/autoria/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Autoria autoria = aDAO.find(Long.parseLong(id));
        aDAO.delete(autoria);
    }
    
}
