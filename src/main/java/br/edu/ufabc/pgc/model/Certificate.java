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
@Table(name = "certificates")
public class Certificate implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "duedate_id")
    private String dueDateId;
    
    @Column(name = "orientador_id")
    private String orientadorId;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "seguranca")
    private String seguranca;
    
    @Column(name = "vercod")
    private String vercod;
    
    @Column(name = "data")
    private String data;
    
    public Certificate() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setDueDateId(String dueDateId) {
        this.dueDateId = dueDateId;
    }
    
    public String getDueDateId() {
        return this.dueDateId;
    }
    
    public void setOrientadorId(String orientadorId) {
        this.orientadorId = orientadorId;
    }
    
    public String getOrientadorId() {
        return this.orientadorId;
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
    
    public void setSeguranca(String seguranca) {
        this.seguranca = seguranca;
    }
    
    public String getSeguranca() {
        return this.seguranca;
    }
    
    public void setVercod(String vercod) {
        this.vercod = vercod;
    }
    
    public String getVercod() {
        return this.vercod;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return this.data;
    }
    
}
