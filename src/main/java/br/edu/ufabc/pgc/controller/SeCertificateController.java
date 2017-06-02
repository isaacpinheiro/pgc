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

import br.edu.ufabc.pgc.dao.SeCertificateDAO;
import br.edu.ufabc.pgc.model.SeCertificate;

@RestController
public class SeCertificateController {
    
    private SeCertificateDAO sDAO = null;
    
    public SeCertificateController() {
        this.sDAO = new SeCertificateDAO();
    }
    
    @RequestMapping(value="/se_certificate/{id}", method=RequestMethod.GET, produces="application/json")
    public SeCertificate listOne(@PathVariable("id") String id) {
        SeCertificate seCertificate = sDAO.find(Long.parseLong(id));
        return seCertificate;
    }
    
    @RequestMapping(value="/se_certificate", method=RequestMethod.GET, produces="application/json")
    public List<SeCertificate> listAll() {
        List<SeCertificate> seCertificate = sDAO.findAll();
        return seCertificate;
    }
    
    @RequestMapping(value="/se_certificate", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody SeCertificate seCertificate) {
        sDAO.save(seCertificate);
    }
    
    @RequestMapping(value="/se_certificate/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        SeCertificate seCertificate = sDAO.find(Long.parseLong(id));
        sDAO.delete(seCertificate);
    }
    
}
