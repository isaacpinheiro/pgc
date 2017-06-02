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

import br.edu.ufabc.pgc.dao.IndividualDAO;
import br.edu.ufabc.pgc.model.Individual;

@RestController
public class IndividualController {
    
    private IndividualDAO iDAO = null;
    
    public IndividualController() {
        this.iDAO = new IndividualDAO();
    }
    
    @RequestMapping(value="/individual/{id}", method=RequestMethod.GET, produces="application/json")
    public Individual listOne(@PathVariable("id") String id) {
        Individual individual = iDAO.find(Long.parseLong(id));
        return individual;
    }
    
    @RequestMapping(value="/individual", method=RequestMethod.GET, produces="application/json")
    public List<Individual> listAll() {
        List<Individual> individual = iDAO.findAll();
        return individual;
    }
    
    @RequestMapping(value="/individual", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Individual individual) {
        iDAO.save(individual);
    }
    
    @RequestMapping(value="/individual/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Individual individual = iDAO.find(Long.parseLong(id));
        iDAO.delete(individual);
    }
    
}
