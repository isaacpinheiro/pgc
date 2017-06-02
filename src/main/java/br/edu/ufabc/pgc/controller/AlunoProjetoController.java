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

import br.edu.ufabc.pgc.dao.AlunoProjetoDAO;
import br.edu.ufabc.pgc.model.AlunoProjeto;

@RestController
public class AlunoProjetoController {
    
    private AlunoProjetoDAO aDAO = null;
    
    public AlunoProjetoController() {
        this.aDAO = new AlunoProjetoDAO();
    }
    
    @RequestMapping(value="/aluno_projeto/{id}", method=RequestMethod.GET, produces="application/json")
    public AlunoProjeto listOne(@PathVariable("id") String id) {
        AlunoProjeto alunoProjeto = aDAO.find(Long.parseLong(id));
        return alunoProjeto;
    }
    
    @RequestMapping(value="/aluno_projeto", method=RequestMethod.GET, produces="application/json")
    public List<AlunoProjeto> listAll() {
        List<AlunoProjeto> alunoProjetos = aDAO.findAll();
        return alunoProjetos;
    }
    
    @RequestMapping(value="/aluno_projeto", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody AlunoProjeto alunoProjeto) {
        aDAO.save(alunoProjeto);
    }
    
    @RequestMapping(value="/aluno_projeto/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        AlunoProjeto alunoProjeto = aDAO.find(Long.parseLong(id));
        aDAO.delete(alunoProjeto);
    }
    
}
