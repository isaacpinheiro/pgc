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

import br.edu.ufabc.pgc.dao.BoardDocumentDAO;
import br.edu.ufabc.pgc.model.BoardDocument;

@RestController
public class BoardDocumentController {
    
    private BoardDocumentDAO bDAO = null;
    
    public BoardDocumentController() {
        this.bDAO = new BoardDocumentDAO();
    }
    
    @RequestMapping(value="/board_document/{id}", method=RequestMethod.GET, produces="application/json")
    public BoardDocument listOne(@PathVariable("id") String id) {
        BoardDocument boardDocument = bDAO.find(Long.parseLong(id));
        return boardDocument;
    }
    
    @RequestMapping(value="/board_document", method=RequestMethod.GET, produces="application/json")
    public List<BoardDocument> listAll() {
        List<BoardDocument> boardDocument = bDAO.findAll();
        return boardDocument;
    }
    
    @RequestMapping(value="/board_document", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody BoardDocument boardDocument) {
        bDAO.save(boardDocument);
    }
    
    @RequestMapping(value="/board_document/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        BoardDocument boardDocument = bDAO.find(Long.parseLong(id));
        bDAO.delete(boardDocument);
    }
    
}
