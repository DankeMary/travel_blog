package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.UserrRoleEntity;

import java.sql.Timestamp;
import java.util.Objects;

public class UserrSO {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserrRoleEntity getRole() {
        return role;
    }

    public void setRole(UserrRoleEntity role) {
        this.role = role;
    }

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
        UserrSO userrSO = (UserrSO) o;
        return Objects.equals(userId, userrSO.userId) &&
                Objects.equals(username, userrSO.username) &&
                Objects.equals(pw, userrSO.pw) &&
                Objects.equals(active, userrSO.active) &&
                Objects.equals(createdOn, userrSO.createdOn) &&
                Objects.equals(vk, userrSO.vk) &&
                Objects.equals(fb, userrSO.fb) &&
                Objects.equals(email, userrSO.email) &&
                Objects.equals(role, userrSO.role) &&
                Objects.equals(banned, userrSO.banned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, pw, active, createdOn, vk, fb, email, role, banned);
    }
}
