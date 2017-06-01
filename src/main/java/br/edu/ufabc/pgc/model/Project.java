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
@Table(name = "projects")
public class Project implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "aluno_id")
    private int alunoId;
    
    @Column(name = "orientador_id")
    private int orientadorId;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "course")
    private String course;
    
    @Column(name = "status")
    private int status;
    
    @Column(name = "pdf")
    private String pdf;
    
    @Column(name = "board_id")
    private int boardId;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "observation")
    private String observation;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "board_date")
    private Date boardDate;
    
    @Column(name = "file_file_name")
    private String fileFileName;
    
    @Column(name = "file_content_type")
    private String fileContentType;
    
    @Column(name = "file_file_size")
    private int fileFileSize;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "file_updated_at")
    private Date fileUpdatedAt;
    
    @Column(name = "groupstate")
    private boolean groupState;
    
    @Column(name = "group_confirm")
    private boolean groupConfirm;
    
    @Column(name = "board_location")
    private String boardLocation;
    
    @Temporal(TemporalType.TIME)
    @Column(name = "boad_time")
    private Date boardTime;
    
    @Column(name = "boad_invitation")
    private boolean boardInvitation;
    
    @Column(name = "ata_confirm")
    private boolean ataConfirm;
    
    @Column(name = "duedate_id")
    private int dueDateId;
    
    @Column(name = "avaliation_type")
    private boolean avaliationType;
    
    @Column(name = "numero_da_ata")
    private String numeroDaAta;
    
    @Column(name = "board_location_2")
    private String boardLocation2;
    
    @Column(name = "co_orientador_id")
    private int coOrientadorId;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "avaliacao_file_name")
    private String avaliacaoFileName;
    
    @Column(name = "avaliacao_content_type")
    private String avaliacaoContentType;
    
    @Column(name = "avaliacao_file_size")
    private int avaliacaoFileSize;
    
    @Column(name = "relatorio")
    private String relatorio;
    
    @Column(name = "form_avaliacao")
    private String formAvaliacao;
    
    @Column(name = "relatorio_enviado")
    private boolean relatorioEnviado;
    
    @Column(name = "token")
    private String token;
    
    @Column(name = "defender_banca")
    private boolean defenderBanca;
    
    @Column(name = "tipo_avaliacao")
    private int tipoAvaliacao;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "interrompido")
    private String interrompido;
    
    @Column(name = "envio")
    private String envio;
    
    public Project() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }
    
    public int getAlunoId() {
        return this.alunoId;
    }
    
    public void setOrientadorId(int orientadorId) {
        this.orientadorId = orientadorId;
    }
    
    public int getOrientadorId() {
        return this.orientadorId;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public int getStatus() {
        return this.status;
    }
    
    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
    
    public String getPdf() {
        return this.pdf;
    }
    
    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }
    
    public int getBoardId() {
        return this.boardId;
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
    
    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    public String getObservation() {
        return this.observation;
    }
    
    public void setBoardDate(Date boardDate) {
        this.boardDate = boardDate;
    }
    
    public Date getBoardDate() {
        return this.boardDate;
    }
    
    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
    
    public String getFileFileName() {
        return this.fileFileName;
    }
    
    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
    
    public String getFileContentType() {
        return this.fileContentType;
    }
    
    public void setFileFileSize(int fileFileSize) {
        this.fileFileSize = fileFileSize;
    }
    
    public int getfileFileSize() {
        return this.fileFileSize;
    }
    
    public void setFileUpdatedAt(Date fileUpdatedAt) {
        this.fileUpdatedAt = fileUpdatedAt;
    }
    
    public Date getFileUpdatedAt() {
        return this.fileUpdatedAt;
    }
    
    public void setGroupState(boolean groupState) {
        this.groupState = groupState;
    }
    
    public boolean getGroupState() {
        return this.groupState;
    }
    
    public void setGroupConfirm(boolean groupConfirm) {
        this.groupConfirm = groupConfirm;
    }
    
    public boolean getGroupConfirm() {
        return this.groupConfirm;
    }
    
    public void setBoardLocation(String boardLocation) {
        this.boardLocation = boardLocation;
    }
    
    public String getBoardLocation() {
        return this.boardLocation;
    }
    
    public void setBoardTime(Date boardTime) {
        this.boardTime = boardTime;
    }
    
    public Date getBoardTime() {
        return this.boardTime;
    }
    
    public void setBoardInvitation(boolean boardInvitation) {
        this.boardInvitation = boardInvitation;
    }
    
    public boolean getBoardInvitation() {
        return this.boardInvitation;
    }
    
    public void setAtaConfirm(boolean ataConfirm) {
        this.ataConfirm = ataConfirm;
    }
    
    public boolean getAtaConfirm() {
        return this.ataConfirm;
    }
    
    public void setDueDateId(int dueDateId) {
        this.dueDateId = dueDateId;
    }
    
    public int getDueDateId() {
        return this.dueDateId;
    }
    
    public void setAvaliationType(boolean avaliationType) {
        this.avaliationType = avaliationType;
    }
    
    public boolean getAvaliationType() {
        return this.avaliationType;
    }
    
    public void setNumeroDaAta(String numeroDaAta) {
        this.numeroDaAta = numeroDaAta;
    }
    
    public String getNumeroDaAta() {
        return this.numeroDaAta;
    }
    
    public void setBoardLocation2(String boardLocation2) {
        this.boardLocation2 = boardLocation2;
    }
    
    public String getBoardLocation2() {
        return this.boardLocation2;
    }
    
    public void setCoOrientadorId(int coOrientadorId) {
        this.coOrientadorId = coOrientadorId;
    }
    
    public int getCoOrientadorId() {
        return this.coOrientadorId;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setAvaliacaoFileName(String avaliacaoFileName) {
        this.avaliacaoFileName = avaliacaoFileName;
    }
    
    public String getAvaliacaoFileName() {
        return this.avaliacaoFileName;
    }
    
    public void setAvaliacaoContentType(String avaliacaoContentType) {
        this.avaliacaoContentType = avaliacaoContentType;
    }
    
    public String getAvaliacaoContentType() {
        return this.avaliacaoContentType;
    }
    
    public int getAvaliacaoFileSize() {
        return this.avaliacaoFileSize;
    }
    
    public void setAvaliacaoFileSize(int avaliacaoFileSize) {
        this.avaliacaoFileSize = avaliacaoFileSize;
    }
    
    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    
    public String getRelatorio() {
        return this.relatorio;
    }
    
    public void setFormAvaliacao(String formAvaliacao) {
        this.formAvaliacao = formAvaliacao;
    }
    
    public String getFormAvaliacao() {
        return this.formAvaliacao;
    }
    
    public void setRelatorioEnviado(boolean relatorioEnviado) {
        this.relatorioEnviado = relatorioEnviado;
    }
    
    public boolean getRelatorioEnviado() {
        return this.relatorioEnviado;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public void setDefenderBanca(boolean defenderBanca) {
        this.defenderBanca = defenderBanca;
    }
    
    public boolean getDefenderBanca() {
        return this.defenderBanca;
    }
    
    public void setTipoAvaliacao(int tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }
    
    public int getTipoAvaliacao() {
        return this.tipoAvaliacao;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setInterrompido(String interrompido) {
        this.interrompido = interrompido;
    }
    
    public String getInterrompido() {
        return this.interrompido;
    }
    
    public void setEnvio(String envio) {
        this.envio = envio;
    }
    
    public String getEnvio() {
        return this.envio;
    }
    
}
