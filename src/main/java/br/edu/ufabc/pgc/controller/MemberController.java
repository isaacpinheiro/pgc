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

import br.edu.ufabc.pgc.dao.MemberDAO;
import br.edu.ufabc.pgc.model.Member;

@RestController
public class MemberController {
    
    private MemberDAO mDAO = null;
    
    public MemberController() {
        this.mDAO = new MemberDAO();
    }
    
    @RequestMapping(value="/member/{id}", method=RequestMethod.GET, produces="application/json")
    public Member listOne(@PathVariable("id") String id) {
        Member member = mDAO.find(Long.parseLong(id));
        return member;
    }
    
    @RequestMapping(value="/member", method=RequestMethod.GET, produces="application/json")
    public List<Member> listAll() {
        List<Member> member = mDAO.findAll();
        return member;
    }
    
    @RequestMapping(value="/member", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Member member) {
        mDAO.save(member);
    }
    
    @RequestMapping(value="/member/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Member member = mDAO.find(Long.parseLong(id));
        mDAO.delete(member);
    }
    
}
