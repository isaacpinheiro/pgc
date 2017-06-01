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
@Table(name = "models")
public class Model implements Serializable {
    
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
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;
    
    public Model() {
        
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
    
}
