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
@Table(name = "board_members")
public class BoardMembers implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "instituicao")
    private String instituicao;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "project_id")
    private int projectId;
    
    @Column(name = "token")
    private String token;
    
    @Column(name = "confirmed")
    private boolean confirmed;
    
    @Column(name = "selected")
    private boolean selected;
    
    @Column(name = "board_document_id")
    private int boardDocumentId;
    
    @Column(name = "confirma_presenca")
    private boolean confirmaPresenca;
    
    
    public BoardMembers() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
    public String getInstituicao() {
        return this.instituicao;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return this.tipo;
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
    
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    
    public int getProjectId() {
        return this.projectId;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
    
    public boolean getConfirmed() {
        return this.confirmed;
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    public boolean getSelected() {
        return this.selected;
    }
    
    public void setBoardDocumentId(int boardDocumentId) {
        this.boardDocumentId = boardDocumentId;
    }
    
    public int getBoardDocumentId() {
        return this.boardDocumentId;
    }
    
    public void setConfirmaPresenca(boolean confirmaPresenca) {
        this.confirmaPresenca = confirmaPresenca;
    }
    
    public boolean getConfirmaPresenca() {
        return this.confirmaPresenca;
    }
    
}
