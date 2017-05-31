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
@Table(name = "certificadonovos")
public class CertificadoNovo implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "orientador_id")
    private String orientadorId;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_inicio")
    private Date dataInicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_fim")
    private Date dataFim;
    
    @Column(name = "security")
    private String security;
    
    @Column(name = "modalidade")
    private String modalidade;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "aluno_nome")
    private String alunoNome;
    
    @Column(name = "busca")
    private String busca;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "email")
    private String email;
    
    public CertificadoNovo() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setOrientadorId(String orientadorId) {
        this.orientadorId = orientadorId;
    }
    
    public String getOrientadorId() {
        return this.orientadorId;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataInicio() {
        return this.dataInicio;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    
    public Date getDataFim() {
        return this.dataFim;
    }
    
    public void setSecurity(String security) {
        this.security = security;
    }
    
    public String getSecurity() {
        return this.security;
    }
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public String getModalidade() {
        return this.modalidade;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }
    
    public String getAlunoNome() {
        return this.alunoNome;
    }
    
    public void setBusca(String busca) {
        this.busca = busca;
    }
    
    public String getBusca() {
        return this.busca;
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
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
}
