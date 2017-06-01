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
@Table(name = "matriculas")
public class Matricula implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "aluno_id")
    private String alunoId;
    
    @Column(name = "ra")
    private int ra;
    
    @Column(name = "disciplina")
    private String disciplina;
    
    @Column(name = "situacao")
    private int situacao;
    
    @Column(name = "observacao")
    private String observacao;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "aluno_nome")
    private String alunoNome;
    
    @Column(name = "duedate")
    private int dueDate;
    
    @Column(name = "file")
    private String file;
    
    public Matricula() {
        
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
    
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public int getRa() {
        return this.ra;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    
    public int getSituacao() {
        return this.situacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public String getObservacao() {
        return this.observacao;
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
    
    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }
    
    public String getAlunoNome() {
        return this.alunoNome;
    }
    
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }
    
    public int getDueDate() {
        return this.dueDate;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }
    
}
