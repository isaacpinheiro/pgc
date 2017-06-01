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
@Table(name = "interrompidos")
public class Interrompido implements Serializable {
    
    public static final long serailVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "motivo")
    private String motivo;
    
    @Column(name = "project_id")
    private String projectId;
    
    @Column(name = "aluno_id")
    private String alunoId;
    
    @Column(name = "orientador_id")
    private String orientadorId;
    
    @Column(name = "data")
    private String data;
    
    @Column(name = "conceito")
    private String conceito;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    public Interrompido() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public String getMotivo() {
        return this.motivo;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }
    
    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }
    
    public String getAlunoId() {
        return this.alunoId;
    }
    
    public void setOrientadorId(String orientadorId) {
        this.orientadorId = orientadorId;
    }
    
    public String getOrientadorId() {
        return this.orientadorId;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return this.data;
    }
    
    public void setConceito(String conceito) {
        this.conceito = conceito;
    }
    
    public String getConceito() {
        return this.conceito;
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
    
}
