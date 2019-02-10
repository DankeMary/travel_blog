package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.PostEntity;
import ru.vsu.database.entity.UserrEntity;

import java.sql.Timestamp;
import java.util.Objects;

public class CommentarySO {
    private Integer commentaryId;
    private String textt;
    private Timestamp createdOn;
    private UserrEntity userr;
    private PostEntity post;

    public Integer getCommentaryId() {
        return commentaryId;
    }

    public void setCommentaryId(Integer commentaryId) {
        this.commentaryId = commentaryId;
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

    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentarySO that = (CommentarySO) o;
        return Objects.equals(commentaryId, that.commentaryId) &&
                Objects.equals(textt, that.textt) &&
                Objects.equals(createdOn, that.createdOn) &&
                Objects.equals(userr, that.userr) &&
                Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentaryId, textt, createdOn, userr, post);
    }
}
