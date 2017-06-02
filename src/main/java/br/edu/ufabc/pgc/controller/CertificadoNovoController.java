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

import br.edu.ufabc.pgc.dao.CertificadoNovoDAO;
import br.edu.ufabc.pgc.model.CertificadoNovo;

@RestController
public class CertificadoNovoController {
    
    private CertificadoNovoDAO cDAO = null;
    
    public CertificadoNovoController() {
        this.cDAO = new CertificadoNovoDAO();
    }
    
    @RequestMapping(value="/certificado_novo/{id}", method=RequestMethod.GET, produces="application/json")
    public CertificadoNovo listOne(@PathVariable("id") String id) {
        CertificadoNovo certificadoNovo = cDAO.find(Long.parseLong(id));
        return certificadoNovo;
    }
    
    @RequestMapping(value="/certificado_novo", method=RequestMethod.GET, produces="application/json")
    public List<CertificadoNovo> listAll() {
        List<CertificadoNovo> certificadoNovo = cDAO.findAll();
        return certificadoNovo;
    }
    
    @RequestMapping(value="/certificado_novo", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody CertificadoNovo certificadoNovo) {
        cDAO.save(certificadoNovo);
    }
    
    @RequestMapping(value="/certificado_novo/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        CertificadoNovo certificadoNovo = cDAO.find(Long.parseLong(id));
        cDAO.delete(certificadoNovo);
    }
    
}
