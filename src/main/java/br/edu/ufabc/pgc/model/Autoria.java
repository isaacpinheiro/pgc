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
@Table(name = "autoria")
public class Autoria implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "project_id")
    private int projectId;
    
    @Column(name = "declaracao_autoria")
    private boolean declaracaoAutoria;
    
    @Column(name = "rg")
    private String rg;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "banca_1")
    private String banca1;
    
    @Column(name = "banca_2")
    private String banca2;
    
    @Column(name = "autorização")
    private int autorizacao;
    
    @Column(name = "observacao")
    private String observacao;
    
    @Column(name = "declaracao_final")
    private boolean declaracaoFinal;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "paginas")
    private int paginas;
    
    public Autoria() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    
    public int getProjectId() {
        return this.projectId;
    }
    
    public void setDeclaracaoAutoria(boolean declaracaoAutoria) {
        this.declaracaoAutoria = declaracaoAutoria;
    }
    
    public boolean getDeclaracaoAutoria() {
        return this.declaracaoAutoria;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setBanca1(String banca1) {
        this.banca1 = banca1;
    }
    
    public String getBanca1() {
        return this.banca1;
    }
    
    public void setBanca2(String banca2) {
        this.banca2 = banca2;
    }
    
    public String getBanca2() {
        return this.banca2;
    }
    
    public void setAutorizacao(int autorizacao) {
        this.autorizacao = autorizacao;
    }
    
    public int getAutorizacao() {
        return this.autorizacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setDeclaracaoFinal(boolean declaracaoFinal) {
        this.declaracaoFinal = declaracaoFinal;
    }
    
    public boolean getDeclaracaoFinal() {
        return this.declaracaoFinal;
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
    
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public int getPaginas() {
        return this.paginas;
    }
    
}
