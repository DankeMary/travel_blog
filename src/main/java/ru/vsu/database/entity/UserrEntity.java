package ru.vsu.database.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "userr", schema = "blog_db")
public class UserrEntity {
    private Integer userId;
    private String username;
    private String pw;
    private Byte active;
    private Timestamp createdOn;
    private String vk;
    private String fb;
    private String email;
    private UserrRoleEntity role;
    private Byte banned;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name = "pw")
    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    
    @Column(name = "active")
    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    
    @Column(name = "vk")
    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    
    @Column(name = "fb")
    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToOne
    @Column(name = "role_id")
    public UserrRoleEntity getRole() {
        return role;
    }

    public void setRole(UserrRoleEntity role) {
        this.role = role;
    }

    
    @Column(name = "banned")
    public Byte getBanned() {
        return banned;
    }

    public void setBanned(Byte banned) {
        this.banned = banned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserrEntity that = (UserrEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (pw != null ? !pw.equals(that.pw) : that.pw != null) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (vk != null ? !vk.equals(that.vk) : that.vk != null) return false;
        if (fb != null ? !fb.equals(that.fb) : that.fb != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (banned != null ? !banned.equals(that.banned) : that.banned != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (pw != null ? pw.hashCode() : 0);
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (vk != null ? vk.hashCode() : 0);
        result = 31 * result + (fb != null ? fb.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (banned != null ? banned.hashCode() : 0);
        return result;
    }
}
