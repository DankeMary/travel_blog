package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.UserrEntity;

import java.sql.Timestamp;
import java.util.Objects;

public class PostSO {
    private Integer postId;
    private String title;
    private String textt;
    private Timestamp createdOn;
    private UserrEntity userr;
    private Byte onCheck;
    private Byte approved;
    private String commentary;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public UserrEntity getUserr() {
        return userr;
    }

    public void setUserr(UserrEntity userr) {
        this.userr = userr;
    }

    public Byte getOnCheck() {
        return onCheck;
    }

    public void setOnCheck(Byte onCheck) {
        this.onCheck = onCheck;
    }

    public Byte getApproved() {
        return approved;
    }

    public void setApproved(Byte approved) {
        this.approved = approved;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostSO postSO = (PostSO) o;
        return Objects.equals(postId, postSO.postId) &&
                Objects.equals(title, postSO.title) &&
                Objects.equals(createdOn, postSO.createdOn) &&
                Objects.equals(userr, postSO.userr) &&
                Objects.equals(onCheck, postSO.onCheck) &&
                Objects.equals(approved, postSO.approved) &&
                Objects.equals(commentary, postSO.commentary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, title, createdOn, userr, onCheck, approved, commentary);
    }
}
