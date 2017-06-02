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

import br.edu.ufabc.pgc.dao.ModelDAO;
import br.edu.ufabc.pgc.model.Model;

@RestController
public class ModelController {
    
    private ModelDAO mDAO = null;
    
    public ModelController() {
        this.mDAO = new ModelDAO();
    }
    
    @RequestMapping(value="/model/{id}", method=RequestMethod.GET, produces="application/json")
    public Model listOne(@PathVariable("id") String id) {
        Model model = mDAO.find(Long.parseLong(id));
        return model;
    }
    
    @RequestMapping(value="/model", method=RequestMethod.GET, produces="application/json")
    public List<Model> listAll() {
        List<Model> model = mDAO.findAll();
        return model;
    }
    
    @RequestMapping(value="/model", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Model model) {
        mDAO.save(model);
    }
    
    @RequestMapping(value="/model/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Model model = mDAO.find(Long.parseLong(id));
        mDAO.delete(model);
    }
    
}
