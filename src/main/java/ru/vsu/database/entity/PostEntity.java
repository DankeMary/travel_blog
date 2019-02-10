package ru.vsu.database.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "post", schema = "blog_db")
public class PostEntity {
    private Integer postId;
    private String title;
    private Timestamp createdOn;
    private UserrEntity userr;
    private Byte onCheck;
    private Byte approved;
    private String commentary;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    
    @Column(name = "on_check")
    public Byte getOnCheck() {
        return onCheck;
    }

    public void setOnCheck(Byte onCheck) {
        this.onCheck = onCheck;
    }

    
    @Column(name = "approved")
    public Byte getApproved() {
        return approved;
    }

    public void setApproved(Byte approved) {
        this.approved = approved;
    }

    
    @Column(name = "commentary")
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

        PostEntity that = (PostEntity) o;

        if (postId != null ? !postId.equals(that.postId) : that.postId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (userr != null ? !userr.equals(that.userr) : that.userr != null) return false;
        if (onCheck != null ? !onCheck.equals(that.onCheck) : that.onCheck != null) return false;
        if (approved != null ? !approved.equals(that.approved) : that.approved != null) return false;
        return commentary != null ? commentary.equals(that.commentary) : that.commentary == null;
    }

    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (userr != null ? userr.hashCode() : 0);
        result = 31 * result + (onCheck != null ? onCheck.hashCode() : 0);
        result = 31 * result + (approved != null ? approved.hashCode() : 0);
        result = 31 * result + (commentary != null ? commentary.hashCode() : 0);
        return result;
    }
}
