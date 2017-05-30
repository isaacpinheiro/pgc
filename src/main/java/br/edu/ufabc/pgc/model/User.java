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
@Table(name = "users")
public class User implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "encrypted_password", nullable = false)
    private String encryptedPassword;
    
    @Column(name = "reset_password_token")
    private String resetPasswordToken;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "reset_password_sent_at")
    private Date resetPasswordSentAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "remember_created_at")
    private Date rememberCreatedAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sign_in_count")
    private int signInCount;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "current_sign_in_at")
    private Date currentSignInAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_sign_in_at")
    private Date lastSignInAt;
    
    @Column(name = "current_sign_in_ip")
    private String currentSignInIp;
    
    @Column(name = "last_sign_in_ip")
    private String lastSignInIp;
    
    @Column(name = "confirmation_token")
    private String confirmationToken;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "confirmed_at")
    private Date confirmedAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "confirmation_sent_at")
    private Date confirmationSentAt;
    
    @Column(name = "unconfirmed_email")
    private String unconfirmedEmail;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "role")
    private String role;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "ra")
    private int ra;
    
    @Column(name = "coordenador")
    private boolean coordenador;
    
    @Column(name = "bloqueado")
    private boolean bloqueado;
    
    @Column(name = "centro")
    private String centro;
    
    public User() {
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }
    
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }
    
    public String getResetPasswordToken() {
        return this.resetPasswordToken;
    }
    
    public void setResetPasswordSentAt(Date resetPasswordSentAt) {
        this.resetPasswordSentAt = resetPasswordSentAt;
    }
    
    public Date getResetPasswordSentAt() {
        return this.resetPasswordSentAt;
    }
    
    public void setRememberCreatedAt(Date rememberCreatedAt) {
        this.rememberCreatedAt = rememberCreatedAt;
    }
    
    public Date getRememberCreatedAt() {
        return this.rememberCreatedAt;
    }
    
    public void setSignInCount(int signInCount) {
        this.signInCount = signInCount;
    }
    
    public int getSignInCount() {
        return this.signInCount;
    }
    
    public void setCurrentSignInAt(Date currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }
    
    public Date getCurrentSignInAt() {
        return this.currentSignInAt;
    }
    
    public void setLastSignInAt(Date lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }
    
    public Date getLastSignInAt() {
        return this.lastSignInAt;
    }
    
    public void setCurrentSignInIp(String currentSignInIp) {
        this.currentSignInIp = currentSignInIp;
    }
    
    public String getCurrentSignInIp() {
        return this.currentSignInIp;
    }
    
    public void setLastSignInIp(String lastSignInIp) {
        this.lastSignInIp = lastSignInIp;
    }
    
    public String getLastSignInIp() {
        return this.lastSignInIp;
    }
    
    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }
    
    public String getConfirmationToken() {
        return this.confirmationToken;
    }
    
    public void setConfirmedAt(Date confirmedAt) {
        this.confirmedAt = confirmedAt;
    }
    
    public Date getConfirmedAt() {
        return this.confirmedAt;
    }
    
    public void setConfirmationSentAt(Date confirmationSentAt) {
        this.confirmationSentAt = confirmationSentAt;
    }
    
    public Date getConfirmationSentAt() {
        return this.confirmationSentAt;
    }
    
    public void setUnconfirmedEmail(String unconfirmedEmail) {
        this.unconfirmedEmail = unconfirmedEmail;
    }
    
    public String getUnconfirmedEmail() {
        return this.unconfirmedEmail;
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
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return this.role;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public int getRa() {
        return this.ra;
    }
    
    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }
    
    public boolean getCoordenador() {
        return this.coordenador;
    }
    
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    public boolean getBloqueado() {
        return this.bloqueado;
    }
    
    public void setCentro(String centro) {
        this.centro = centro;
    }
    
    public String getCentro() {
        return this.centro;
    }
    
}
