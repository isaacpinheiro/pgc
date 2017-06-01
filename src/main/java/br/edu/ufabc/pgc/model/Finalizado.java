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
@Table(name = "finalizados")
public class Finalizado implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "aluno_id")
    private String alunoId;
    
    @Column(name = "duedate_id")
    private String dueDateId;
    
    @Column(name = "parcer")
    private String parcer;
    
    @Column(name = "orientador_id")
    private String orientadorId;
    
    @Column(name = "project_id")
    private String projectId;
    
    @Column(name = "finalizado")
    private String finalizado;
    
    @Column(name = "data")
    private String data;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    public Finalizado() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }
    
    public String getAlunoId() {
        return this.alunoId;
    }
    
    public void setDueDateId(String dueDateId) {
        this.dueDateId = dueDateId;
    }
    
    public String getDueDateId() {
        return this.dueDateId;
    }
    
    public void setParcer(String parcer) {
        this.parcer = parcer;
    }
    
    public String getParcer() {
        return this.parcer;
    }
    
    public void setOrientadorId(String orientadorId) {
        this.orientadorId = orientadorId;
    }
    
    public String getOrientadorId() {
        return this.orientadorId;
    }
    
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    
    public String getProjectId() {
        return this.projectId;
    }
    
    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }
    
    public String getFinalizado() {
        return this.finalizado;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return this.data;
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
