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

import br.edu.ufabc.pgc.dao.MatriculaDAO;
import br.edu.ufabc.pgc.model.Matricula;

@RestController
public class MatriculaController {
    
    private MatriculaDAO mDAO = null;
    
    public MatriculaController() {
        this.mDAO = new MatriculaDAO();
    }
    
    @RequestMapping(value="/matricula/{id}", method=RequestMethod.GET, produces="application/json")
    public Matricula listOne(@PathVariable("id") String id) {
        Matricula matricula = mDAO.find(Long.parseLong(id));
        return matricula;
    }
    
    @RequestMapping(value="/matricula", method=RequestMethod.GET, produces="application/json")
    public List<Matricula> listAll() {
        List<Matricula> matricula = mDAO.findAll();
        return matricula;
    }
    
    @RequestMapping(value="/matricula", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Matricula matricula) {
        mDAO.save(matricula);
    }
    
    @RequestMapping(value="/matricula/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Matricula matricula = mDAO.find(Long.parseLong(id));
        mDAO.delete(matricula);
    }
    
}
