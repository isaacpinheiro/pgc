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
@Table(name = "notafinals")
public class NotaFinal implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "nomealuno")
    private String nomeAluno;
    
    @Column(name = "novanota")
    private String novaNota;
    
    @Column(name = "confirma")
    private String confirma;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "periodo_id")
    private String periodoId;
    
    @Column(name = "dataenvio")
    private String dataEnvio;
    
    @Column(name = "arquivo")
    private String arquivo;
    
    public NotaFinal() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeAluno() {
        return this.nomeAluno;
    }
    
    public void setNovaNota(String novaNota) {
        this.novaNota = novaNota;
    }
    
    public String getNovaNota() {
        return this.novaNota;
    }
    
    public void setConfirma(String confirma) {
        this.confirma = confirma;
    }
    
    public String getConfirma() {
        return this.confirma;
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
    
    public void setPeriodoId(String periodoId) {
        this.periodoId = periodoId;
    }
    
    public String getPeriodoId() {
        return this.periodoId;
    }
    
    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
    
    public String getDataEnvio() {
        return this.dataEnvio;
    }
    
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    
    public String getArquivo() {
        return this.arquivo;
    }
    
}
