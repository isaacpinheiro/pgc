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

import br.edu.ufabc.pgc.dao.DisciplinaDAO;
import br.edu.ufabc.pgc.model.Disciplina;

@RestController
public class DisciplinaController {
    
    private DisciplinaDAO dDAO = null;
    
    public DisciplinaController() {
        this.dDAO = new DisciplinaDAO();
    }
    
    @RequestMapping(value="/disciplina/{id}", method=RequestMethod.GET, produces="application/json")
    public Disciplina listOne(@PathVariable("id") String id) {
        Disciplina disciplina = dDAO.find(Long.parseLong(id));
        return disciplina;
    }
    
    @RequestMapping(value="/disciplina", method=RequestMethod.GET, produces="application/json")
    public List<Disciplina> listAll() {
        List<Disciplina> disciplina = dDAO.findAll();
        return disciplina;
    }
    
    @RequestMapping(value="/disciplina", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Disciplina disciplina) {
        dDAO.save(disciplina);
    }
    
    @RequestMapping(value="/disciplina/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Disciplina disciplina = dDAO.find(Long.parseLong(id));
        dDAO.delete(disciplina);
    }
    
}
