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

import br.edu.ufabc.pgc.dao.InterrompidoDAO;
import br.edu.ufabc.pgc.model.Interrompido;

@RestController
public class InterrompidoController {
    
    private InterrompidoDAO iDAO = null;
    
    public InterrompidoController() {
        this.iDAO = new InterrompidoDAO();
    }
    
    @RequestMapping(value="/interrompido/{id}", method=RequestMethod.GET, produces="application/json")
    public Interrompido listOne(@PathVariable("id") String id) {
        Interrompido interrompido = iDAO.find(Long.parseLong(id));
        return interrompido;
    }
    
    @RequestMapping(value="/interrompido", method=RequestMethod.GET, produces="application/json")
    public List<Interrompido> listAll() {
        List<Interrompido> interrompido = iDAO.findAll();
        return interrompido;
    }
    
    @RequestMapping(value="/interrompido", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Interrompido interrompido) {
        iDAO.save(interrompido);
    }
    
    @RequestMapping(value="/interrompido/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Interrompido interrompido = iDAO.find(Long.parseLong(id));
        iDAO.delete(interrompido);
    }
    
}
