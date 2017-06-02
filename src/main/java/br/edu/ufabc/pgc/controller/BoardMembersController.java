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

import br.edu.ufabc.pgc.dao.BoardMembersDAO;
import br.edu.ufabc.pgc.model.BoardMembers;

@RestController
public class BoardMembersController {
    
    private BoardMembersDAO bDAO = null;
    
    public BoardMembersController() {
        this.bDAO = new BoardMembersDAO();
    }
    
    @RequestMapping(value="/board_members/{id}", method=RequestMethod.GET, produces="application/json")
    public BoardMembers listOne(@PathVariable("id") String id) {
        BoardMembers boardMembers = bDAO.find(Long.parseLong(id));
        return boardMembers;
    }
    
    @RequestMapping(value="/board_members", method=RequestMethod.GET, produces="application/json")
    public List<BoardMembers> listAll() {
        List<BoardMembers> boardMembers = bDAO.findAll();
        return boardMembers;
    }
    
    @RequestMapping(value="/board_members", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody BoardMembers boardMembers) {
        bDAO.save(boardMembers);
    }
    
    @RequestMapping(value="/board_members/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        BoardMembers boardMembers = bDAO.find(Long.parseLong(id));
        bDAO.delete(boardMembers);
    }
    
}
