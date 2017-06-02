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

import br.edu.ufabc.pgc.dao.CertificateDAO;
import br.edu.ufabc.pgc.model.Certificate;

@RestController
public class CertificateController {
    
    private CertificateDAO cDAO = null;
    
    public CertificateController() {
        this.cDAO = new CertificateDAO();
    }
    
    @RequestMapping(value="/certificate/{id}", method=RequestMethod.GET, produces="application/json")
    public Certificate listOne(@PathVariable("id") String id) {
        Certificate certificate = cDAO.find(Long.parseLong(id));
        return certificate;
    }
    
    @RequestMapping(value="/certificate", method=RequestMethod.GET, produces="application/json")
    public List<Certificate> listAll() {
        List<Certificate> certificate = cDAO.findAll();
        return certificate;
    }
    
    @RequestMapping(value="/certificate", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody Certificate certificate) {
        cDAO.save(certificate);
    }
    
    @RequestMapping(value="/certificate/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        Certificate certificate = cDAO.find(Long.parseLong(id));
        cDAO.delete(certificate);
    }
    
}
