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
@Table(name = "duedates")
public class DueDate implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orientation_start")
    private Date orientationStart;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orientation_end")
    private Date orientationEnd;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "evaluation_start")
    private Date evaluationStart;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "evaluation_end")
    private Date evaluationEnd;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "board_start")
    private Date boardStart;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "board_end")
    private Date boardEnd;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "trimestre")
    private String trimestre;
    
    @Column(name = "terminado")
    private boolean terminado;
    
    @Column(name = "finalizado")
    private boolean finalizado;
    
    @Column(name = "quantidade_atas")
    private int quantidadeAtas;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "matricula_inicio")
    private Date matriculaInicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "matricula_fim")
    private Date matriculaFim;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "prazo_ata")
    private Date prazoAta;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "prazo_relatorio")
    private Date prazoRelatorio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "prazo_conceito")
    private Date prazoConteito;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datadeenvio")
    private Date dataDeEnvio;
    
    public DueDate() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setOrientationStart(Date orientationStart) {
        this.orientationStart = orientationStart;
    }
    
    public Date getOrientationStart() {
        return this.orientationStart;
    }
    
    public void setOrientationEnd(Date orientationEnd) {
        this.orientationEnd = orientationEnd;
    }
    
    public Date getOrientationEnd() {
        return this.orientationEnd;
    }
    
    public void setEvaluationStart(Date evaluationStart) {
        this.evaluationStart = evaluationStart;
    }
    
    public Date getEvaluationStart() {
        return this.evaluationStart;
    }
    
    public void setEvaluationEnd(Date evaluationEnd) {
        this.evaluationEnd = evaluationEnd;
    }
    
    public Date getEvaluationEnd() {
        return this.evaluationEnd;
    }
    
    public void setBoardStart(Date boardStart) {
        this.boardStart = boardStart;
    }
    
    public Date getBoardStart() {
        return this.boardStart;
    }
    
    public void setBoardEnd(Date boardEnd) {
        this.boardEnd = boardEnd;
    }
    
    public Date getBoardEnd() {
        return this.boardEnd;
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
    
    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }
    
    public String getTrimestre() {
        return this.trimestre;
    }
    
    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
    
    public boolean getTerminado() {
        return this.terminado;
    }
    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    public boolean getFinalizado() {
        return this.finalizado;
    }
    
    public void setQuantidadeAtas(int quantidadeAtas) {
        this.quantidadeAtas = quantidadeAtas;
    }
    
    public int getQuantidadeAtas() {
        return this.quantidadeAtas;
    }
    
    public void setMatriculaInicio(Date matriculaInicio) {
        this.matriculaInicio = matriculaInicio;
    }
    
    public Date getMatriculaInicio() {
        return this.matriculaInicio;
    }
    
    public void setMatriculaFim(Date matriculaFim) {
        this.matriculaFim = matriculaFim;
    }
    
    public Date getMatriculaFim() {
        return this.matriculaFim;
    }
    
    public void setPrazoAta(Date prazoAta) {
        this.prazoAta = prazoAta;
    }
    
    public Date getPrazoAta() {
        return this.prazoAta;
    }
    
    public void setPrazoRelatorio(Date prazoRelatorio) {
        this.prazoRelatorio = prazoRelatorio;
    }
    
    public Date getPrazoRelatorio() {
        return this.prazoRelatorio;
    }
    
    public void setPrazoConteito(Date prazoConteito) {
        this.prazoConteito = prazoConteito;
    }
    
    public Date getPrazoConteito() {
        return this.prazoConteito;
    }
    
    public void setDataDeEnvio(Date dataDeEnvio) {
        this.dataDeEnvio = dataDeEnvio;
    }
    
    public Date getDataDeEnvio() {
        return this.dataDeEnvio;
    }
    
}
