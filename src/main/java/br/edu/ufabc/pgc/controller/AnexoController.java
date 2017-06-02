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

import br.edu.ufabc.pgc.dao.AnexoDAO;
import br.edu.ufabc.pgc.model.Anexo;

@RestController
public class AnexoController {
    
    private AnexoDAO aDAO = null;
    
    public AnexoController() {
        this.aDAO = new AnexoDAO();
    }
    
    @RequestMapping(value="/anexo/{id}", method=RequestMethod.GET, produces="application/json")
    public Anexo listOne(@PathVariable("id") String id) {
        Anexo anexo = aDAO.find(Long.parseLong(id));
        return anexo;
    }
    
    @RequestMapping(value="/anexo", method=RequestMethod.GET, produces="application/json")
    public List<Anexo> listAll() {
        List<Anexo> anexo = aDAO.findAll();
        return anexo;
    }
    
    @RequestMapping(value="/anexo", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Anexo anexo) {
        aDAO.save(anexo);
    }
    
    @RequestMapping(value="/anexo/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Anexo anexo = aDAO.find(Long.parseLong(id));
        aDAO.delete(anexo);
    }
    
}
