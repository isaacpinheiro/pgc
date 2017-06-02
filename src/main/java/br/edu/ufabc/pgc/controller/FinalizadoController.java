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

import br.edu.ufabc.pgc.dao.FinalizadoDAO;
import br.edu.ufabc.pgc.model.Finalizado;

@RestController
public class FinalizadoController {
    
    private FinalizadoDAO fDAO = null;
    
    public FinalizadoController() {
        this.fDAO = new FinalizadoDAO();
    }
    
    @RequestMapping(value="/finalizado/{id}", method=RequestMethod.GET, produces="application/json")
    public Finalizado listOne(@PathVariable("id") String id) {
        Finalizado finalizado = fDAO.find(Long.parseLong(id));
        return finalizado;
    }
    
    @RequestMapping(value="/finalizado", method=RequestMethod.GET, produces="application/json")
    public List<Finalizado> listAll() {
        List<Finalizado> finalizado = fDAO.findAll();
        return finalizado;
    }
    
    @RequestMapping(value="/finalizado", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Finalizado finalizado) {
        fDAO.save(finalizado);
    }
    
    @RequestMapping(value="/finalizado/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Finalizado finalizado = fDAO.find(Long.parseLong(id));
        fDAO.delete(finalizado);
    }
    
}
