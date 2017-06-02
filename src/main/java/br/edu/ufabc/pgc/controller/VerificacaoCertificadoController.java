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

import br.edu.ufabc.pgc.dao.VerificacaoCertificadoDAO;
import br.edu.ufabc.pgc.model.VerificacaoCertificado;

@RestController
public class VerificacaoCertificadoController {
    
    private VerificacaoCertificadoDAO vDAO = null;
    
    public VerificacaoCertificadoController() {
        this.vDAO = new VerificacaoCertificadoDAO();
    }
    
    @RequestMapping(value="/verificacao_certificado/{id}", method=RequestMethod.GET, produces="application/json")
    public VerificacaoCertificado listOne(@PathVariable("id") String id) {
        VerificacaoCertificado verificacaoCertificado = vDAO.find(Long.parseLong(id));
        return verificacaoCertificado;
    }
    
    @RequestMapping(value="/verificacao_certificado", method=RequestMethod.GET, produces="application/json")
    public List<VerificacaoCertificado> listAll() {
        List<VerificacaoCertificado> verificacaoCertificado = vDAO.findAll();
        return verificacaoCertificado;
    }
    
    @RequestMapping(value="/verificacao_certificado", method=RequestMethod.POST, consumes="application/json")
    public void insert(@RequestBody VerificacaoCertificado verificacaoCertificado) {
        vDAO.save(verificacaoCertificado);
    }
    
    @RequestMapping(value="/verificacao_certificado/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
        VerificacaoCertificado verificacaoCertificado = vDAO.find(Long.parseLong(id));
        vDAO.delete(verificacaoCertificado);
    }
    
}
