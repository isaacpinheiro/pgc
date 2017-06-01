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
@Table(name = "secertificates")
public class SeCertificate implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "email")
    private String email;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "modalidade")
    private String modalidade;
    
    @Column(name = "periodo")
    private String periodo;
    
    @Column(name = "vercode")
    private String vercode;
    
    @Column(name = "security")
    private String security;
    
    public SeCertificate() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
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
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public String getModalidade() {
        return this.modalidade;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setVercode(String vercode) {
        this.vercode = vercode;
    }
    
    public String getVercode() {
        return this.vercode;
    }
    
    public void setSecurity(String security) {
        this.security = security;
    }
    
    public String getSecurity() {
        return this.security;
    }
    
}
