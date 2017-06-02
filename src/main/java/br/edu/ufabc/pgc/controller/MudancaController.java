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

import br.edu.ufabc.pgc.dao.MudancaDAO;
import br.edu.ufabc.pgc.model.Mudanca;

@RestController
public class MudancaController {
    
    private MudancaDAO mDAO = null;
    
    public MudancaController() {
        this.mDAO = new MudancaDAO();
    }
    
    @RequestMapping(value="/mudanca/{id}", method=RequestMethod.GET, produces="application/json")
    public Mudanca listOne(@PathVariable("id") String id) {
        Mudanca mudanca = mDAO.find(Long.parseLong(id));
        return mudanca;
    }
    
    @RequestMapping(value="/mudanca", method=RequestMethod.GET, produces="application/json")
    public List<Mudanca> listAll() {
        List<Mudanca> mudanca = mDAO.findAll();
        return mudanca;
    }
    
    @RequestMapping(value="/mudanca", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Mudanca mudanca) {
        mDAO.save(mudanca);
    }
    
    @RequestMapping(value="/mudanca/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Mudanca mudanca = mDAO.find(Long.parseLong(id));
        mDAO.delete(mudanca);
    }
    
}
