/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.pgc.model;

/**
 *
 * @author isaac
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mudancas")
public class Mudanca implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "codigo_disciplina")
    private String codigoDisciplina;
    
    @Column(name = "nome_disciplina")
    private String nomeDisciplina;
    
    @Column(name = "codigo_covalidacao")
    private String codigoCovalidacao;
    
    @Column(name = "nome_covalidacao")
    private String nomeCovalidacao;
    
    @Column(name = "matriz")
    private int matriz;
    
    @Column(name = "tipodisciplina_bct")
    private int tipoDisciplinaBct;
    
    @Column(name = "tipodisciplina_bcc")
    private int tipoDisciplinaBcc;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "tipodisciplina_bmat")
    private int tipoDisciplinaBmat;
    
    @Column(name = "tipodisciplina_lmat")
    private int tipoDisciplinaLmat;
    
    @Column(name = "tipodisciplina_bn")
    private int tipoDisciplinaBn;
    
    public Mudanca() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }
    
    public String getCodigoDisciplina() {
        return this.codigoDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }
    
    public void setCodigoCovalidacao(String codigoCovalidacao) {
        this.codigoCovalidacao = codigoCovalidacao;
    }
    
    public String getCodigoCovalidacao() {
        return this.codigoCovalidacao;
    }
    
    public void setNomeCovalidacao(String nomeCovalidacao) {
        this.nomeCovalidacao = nomeCovalidacao;
    }
    
    public String getNomeCovalidacao() {
        return this.nomeCovalidacao;
    }
    
    public void setMatriz(int matriz) {
        this.matriz = matriz;
    }
    
    public int getMatriz() {
        return this.matriz;
    }
    
    public void setTipoDisciplinaBct(int tipoDisciplinaBct) {
        this.tipoDisciplinaBct = tipoDisciplinaBct;
    }
    
    public int getTipoDisciplinaBct() {
        return this.tipoDisciplinaBct;
    }
    
    public void setTipoDisciplinaBcc(int tipoDisciplinaBcc) {
        this.tipoDisciplinaBcc = tipoDisciplinaBcc;
    }
    
    public int getTipoDisciplinaBcc() {
        return this.tipoDisciplinaBcc;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setTipoDisciplinaBmat(int tipoDisciplinaBmat) {
        this.tipoDisciplinaBmat = tipoDisciplinaBmat;
    }
    
    public int getTipoDisciplinaBmat() {
        return this.tipoDisciplinaBmat;
    }
    
    public void setTipoDisciplinaLmat(int tipoDisciplinaLmat) {
        this.tipoDisciplinaLmat = tipoDisciplinaLmat;
    }
    
    public int getTipoDisciplinaLmat() {
        return this.tipoDisciplinaLmat;
    }
    
    public void setTipoDisciplinaBn(int tipoDisciplinaBn) {
        this.tipoDisciplinaBn = tipoDisciplinaBn;
    }
    
    public int getTipoDisciplinaBn() {
        return this.tipoDisciplinaBn;
    }
    
}
