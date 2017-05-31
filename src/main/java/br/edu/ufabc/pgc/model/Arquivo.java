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
@Table(name = "arquivos")
public class Arquivo implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "file")
    private String file;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "matriz")
    private int matriz;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "ra")
    private int ra;
    
    @Column(name = "relatorio")
    private String relatorio;
    
    public Arquivo() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setFile(String file) {
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
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
    
    public void setMatriz(int matriz) {
        this.matriz = matriz;
    }
    
    public int getMatriz() {
        return this.matriz;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public int getRa() {
        return this.ra;
    }
    
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    
    public String getRelatorio() {
        return this.relatorio;
    }
    
}
