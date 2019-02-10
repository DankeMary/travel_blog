package ru.vsu.database.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "commentary", schema = "blog_db")
public class CommentaryEntity {
    private Integer commentaryId;
    private String textt;
    private Timestamp createdOn;
    private UserrEntity userr;
    private PostEntity post;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentary_id")
    public Integer getCommentaryId() {
        return commentaryId;
    }

    public void setCommentaryId(Integer commentaryId) {
        this.commentaryId = commentaryId;
    }

    
    @Column(name = "textt")
    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }

    
    @Column(name = "created_on")
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @ManyToOne
    @Column(name = "user_id")
    public UserrEntity getUserr() {
        return userr;
    }

    public void setUserr(UserrEntity userr) {
        this.userr = userr;
    }

    @ManyToOne
    @Column(name = "post_id")
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

        CommentaryEntity that = (CommentaryEntity) o;

        if (commentaryId != null ? !commentaryId.equals(that.commentaryId) : that.commentaryId != null) return false;
        if (textt != null ? !textt.equals(that.textt) : that.textt != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (userr != null ? !userr.equals(that.userr) : that.userr != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentaryId != null ? commentaryId.hashCode() : 0;
        result = 31 * result + (textt != null ? textt.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (userr != null ? userr.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }
}
