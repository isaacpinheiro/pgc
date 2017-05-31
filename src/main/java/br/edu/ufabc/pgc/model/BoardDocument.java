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
@Table(name = "board_documents")
public class BoardDocument implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "project_id")
    private int projectId;
    
    @Column(name = "approval")
    private String approval;
    
    @Column(name = "mark")
    private String mark;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;
    
    @Column(name = "location")
    private String location;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "time")
    private Date time;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cupdated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "location2")
    private String location2;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "atadigital_file_name")
    private String ataDigitalFileName;
    
    @Column(name = "atadigital_content_type")
    private String ataDigitalContentType;
    
    @Column(name = "atadigital_file_size")
    private int ataDigitalFileSize;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "atadigital_updated_at")
    private Date ataDigitalUpdatedAt;
    
    @Column(name = "board_location_2")
    private String boardLocation2;
    
    @Column(name = "ata_digitalizada")
    private String ataDigitalizada;
    
    @Column(name = "ata_enviada")
    private boolean ataEnviada;
    
    public BoardDocument() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
    
    public int getProjectId() {
        return this.projectId;
    }
    
    public void setApproval(String approval) {
        this.approval = approval;
    }
    
    public String getApproval() {
        return this.approval;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public String getMark() {
        return this.mark;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getDate() {
        return this.date;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    
    public Date getTime() {
        return this.time;
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
    
    public void setLocation2(String location2) {
        this.location2 = location2;
    }
    
    public String getLocation2() {
        return this.location2;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setAtaDigitalFileName(String ataDigitalFileName) {
        this.ataDigitalFileName = ataDigitalFileName;
    }
    
    public String getAtaDigitalFileName() {
        return this.ataDigitalFileName;
    }
    
    public void setAtaDigitalContentType(String ataDigitalContentType) {
        this.ataDigitalContentType = ataDigitalContentType;
    }
    
    public String getAtaDigitalContentType() {
        return this.ataDigitalContentType;
    }
    
    public void setAtaDigitalFileSize(int ataDigitalFileSize) {
        this.ataDigitalFileSize = ataDigitalFileSize;
    }
    
    public int getAtaDigitalFileSize() {
        return this.ataDigitalFileSize;
    }
    
    public void setAtaDigitalUpdatedAt(Date ataDigitalUpdatedAt) {
        this.ataDigitalUpdatedAt = ataDigitalUpdatedAt;
    }
    
    public Date getAtaDigitalUpdatedAt() {
        return this.ataDigitalUpdatedAt;
    }
    
    public void setBoardLocation2(String boardLocation2) {
        this.boardLocation2 = boardLocation2;
    }
    
    public String getBoardLocation2() {
        return this.boardLocation2;
    }
    
    public void setAtaDigitalizada(String ataDigitalizada) {
        this.ataDigitalizada = ataDigitalizada;
    }
    
    public String getAtaDigitalizada() {
        return this.ataDigitalizada;
    }
    
    public void setAtaEnviada(boolean ataEnviada) {
        this.ataEnviada = ataEnviada;
    }
    
    public boolean getAtaEnviada() {
        return this.ataEnviada;
    }
    
}
