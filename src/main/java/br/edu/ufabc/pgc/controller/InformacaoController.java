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

import br.edu.ufabc.pgc.dao.InformacaoDAO;
import br.edu.ufabc.pgc.model.Informacao;

@RestController
public class InformacaoController {
    
    private InformacaoDAO iDAO = null;
    
    public InformacaoController() {
        this.iDAO = new InformacaoDAO();
    }
    
    @RequestMapping(value="/informacao/{id}", method=RequestMethod.GET, produces="application/json")
    public Informacao listOne(@PathVariable("id") String id) {
        Informacao informacao = iDAO.find(Long.parseLong(id));
        return informacao;
    }
    
    @RequestMapping(value="/informacao", method=RequestMethod.GET, produces="application/json")
    public List<Informacao> listAll() {
        List<Informacao> informacao = iDAO.findAll();
        return informacao;
    }
    
    @RequestMapping(value="/informacao", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Informacao informacao) {
        iDAO.save(informacao);
    }
    
    @RequestMapping(value="/informacao/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Informacao informacao = iDAO.find(Long.parseLong(id));
        iDAO.delete(informacao);
    }
    
}
