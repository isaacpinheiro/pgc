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

import br.edu.ufabc.pgc.dao.NotaFinalDAO;
import br.edu.ufabc.pgc.model.NotaFinal;

@RestController
public class NotaFinalController {
    
    private NotaFinalDAO nDAO = null;
    
    public NotaFinalController() {
        this.nDAO = new NotaFinalDAO();
    }
    
    @RequestMapping(value="/nota_final/{id}", method=RequestMethod.GET, produces="application/json")
    public NotaFinal listOne(@PathVariable("id") String id) {
        NotaFinal notaFinal = nDAO.find(Long.parseLong(id));
        return notaFinal;
    }
    
    @RequestMapping(value="/nota_final", method=RequestMethod.GET, produces="application/json")
    public List<NotaFinal> listAll() {
        List<NotaFinal> notaFinal = nDAO.findAll();
        return notaFinal;
    }
    
    @RequestMapping(value="/nota_final", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody NotaFinal notaFinal) {
        nDAO.save(notaFinal);
    }
    
    @RequestMapping(value="/nota_final/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        NotaFinal notaFinal = nDAO.find(Long.parseLong(id));
        nDAO.delete(notaFinal);
    }
    
}
