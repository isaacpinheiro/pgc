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
@Table(name = "evaluations")
public class Evaluation implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "answer1")
    private String answer1;
    
    @Column(name = "answer2")
    private String answer2;
    
    @Column(name = "answer3")
    private String answer3;
    
    @Column(name = "answer4")
    private String answer4;
    
    @Column(name = "answer5")
    private String answer5;
    
    @Column(name = "answer6")
    private String answer6;
    
    @Column(name = "answer7")
    private String answer7;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "project_id")
    private int projectId;
    
    @Column(name = "situacao")
    private String situacao;
    
    public Evaluation() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    
    public String getAnswer1() {
        return this.answer1;
    }
    
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    
    public String getAnswer2() {
        return this.answer2;
    }
    
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    
    public String getAnswer3() {
        return this.answer3;
    }
    
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
    
    public String getAnswer4() {
        return this.answer4;
    }
    
    public void setAnswer5(String answer5) {
        this.answer5 = answer5;
    }
    
    public String getAnswer5() {
        return this.answer5;
    }
    
    public void setAnswer6(String answer6) {
        this.answer6 = answer6;
    }
    
    public String getAnswer6() {
        return this.answer6;
    }
    
    public void setAnswer7(String answer7) {
        this.answer7 = answer7;
    }
    
    public String getAnswer7() {
        return this.answer7;
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
    
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public String getSituacao() {
        return this.situacao;
    }
    
}
