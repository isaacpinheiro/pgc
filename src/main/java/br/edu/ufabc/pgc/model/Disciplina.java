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
@Table(name = "disciplinas")
public class Disciplina implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "codigo")
    private String codigo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "creditos")
    private int creditos;
    
    @Column(name = "matriz")
    private int matriz;
    
    @Column(name = "tipodisciplina_bct")
    private int tipoDisciplinaBct;
    
    @Column(name = "tipodisciplina_bcc")
    private int tipoDisciplinaBcc;
    
    @Column(name = "tipodisciplina_bmat")
    private int tipoDisciplinaBmat;
    
    @Column(name = "tipodisciplina_bn")
    private int tipoDisciplinaBn;
    
    @Column(name = "tipodisciplina_lmat")
    private int tipoDisciplinaLmat;
    
    public Disciplina() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
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
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int getCreditos() {
        return this.creditos;
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
    
    public void setTipoDisciplinaBmat(int tipoDisciplinaBmat) {
        this.tipoDisciplinaBmat = tipoDisciplinaBmat;
    }
    
    public int getTipoDisciplinaBmat() {
        return this.tipoDisciplinaBmat;
    }
    
    public void setTipoDisciplinaBn(int tipoDisciplinaBn) {
        this.tipoDisciplinaBn = tipoDisciplinaBn;
    }
    
    public int getTipoDisciplinaBn() {
        return this.tipoDisciplinaBn;
    }
    
    public void setTipoDisciplinaLmat(int tipoDisciplinaLmat) {
        this.tipoDisciplinaLmat = tipoDisciplinaLmat;
    }
    
    public int getTipoDisciplinaLmat() {
        return this.tipoDisciplinaLmat;
    }
    
}
