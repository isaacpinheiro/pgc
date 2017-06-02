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

import br.edu.ufabc.pgc.dao.ProjectDAO;
import br.edu.ufabc.pgc.model.Project;

@RestController
public class ProjectController {
    
    private ProjectDAO pDAO = null;
    
    public ProjectController() {
        this.pDAO = new ProjectDAO();
    }
    
    @RequestMapping(value="/project/{id}", method=RequestMethod.GET, produces="application/json")
    public Project listOne(@PathVariable("id") String id) {
        Project project = pDAO.find(Long.parseLong(id));
        return project;
    }
    
    @RequestMapping(value="/project", method=RequestMethod.GET, produces="application/json")
    public List<Project> listAll() {
        List<Project> project = pDAO.findAll();
        return project;
    }
    
    @RequestMapping(value="/project", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Project project) {
        pDAO.save(project);
    }
    
    @RequestMapping(value="/project/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Project project = pDAO.find(Long.parseLong(id));
        pDAO.delete(project);
    }
    
}
