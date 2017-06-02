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

import br.edu.ufabc.pgc.dao.EvaluationDAO;
import br.edu.ufabc.pgc.model.Evaluation;

@RestController
public class EvaluationController {
    
    private EvaluationDAO eDAO = null;
    
    public EvaluationController() {
        this.eDAO = new EvaluationDAO();
    }
    
    @RequestMapping(value="/evaluation/{id}", method=RequestMethod.GET, produces="application/json")
    public Evaluation listOne(@PathVariable("id") String id) {
        Evaluation evaluation = eDAO.find(Long.parseLong(id));
        return evaluation;
    }
    
    @RequestMapping(value="/evaluation", method=RequestMethod.GET, produces="application/json")
    public List<Evaluation> listAll() {
        List<Evaluation> evaluation = eDAO.findAll();
        return evaluation;
    }
    
    @RequestMapping(value="/evaluation", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Evaluation evaluation) {
        eDAO.save(evaluation);
    }
    
    @RequestMapping(value="/evaluation/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Evaluation evaluation = eDAO.find(Long.parseLong(id));
        eDAO.delete(evaluation);
    }
    
}
