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

import br.edu.ufabc.pgc.dao.ArquivoDAO;
import br.edu.ufabc.pgc.model.Arquivo;

@RestController
public class ArquivoController {
    
    private ArquivoDAO aDAO = null;
    
    public ArquivoController() {
        this.aDAO = new ArquivoDAO();
    }
    
    @RequestMapping(value="/arquivo/{id}", method=RequestMethod.GET, produces="application/json")
    public Arquivo listOne(@PathVariable("id") String id) {
        Arquivo arquivo = aDAO.find(Long.parseLong(id));
        return arquivo;
    }
    
    @RequestMapping(value="/arquivo", method=RequestMethod.GET, produces="application/json")
    public List<Arquivo> listAll() {
        List<Arquivo> arquivo = aDAO.findAll();
        return arquivo;
    }
    
    @RequestMapping(value="/Arquivo", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Arquivo arquivo) {
        aDAO.save(arquivo);
    }
    
    @RequestMapping(value="/arquivo/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Arquivo arquivo = aDAO.find(Long.parseLong(id));
        aDAO.delete(arquivo);
    }
    
}
