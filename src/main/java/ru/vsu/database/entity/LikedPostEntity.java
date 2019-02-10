package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "liked_post", schema = "blog_db")
public class LikedPostEntity {
    private Integer likedPostId;
    private UserrEntity userr;
    private PostEntity post;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "liked_post_id")
    public Integer getLikedPostId() {
        return likedPostId;
    }

    public void setLikedPostId(Integer likedPostId) {
        this.likedPostId = likedPostId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public UserrEntity getUserr() {
        return userr;
    }

    public void setUserr(UserrEntity userId) {
        this.userr = userId;
    }

    @ManyToOne
    @JoinColumn(name = "post_id")
    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity postId) {
        this.post = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LikedPostEntity that = (LikedPostEntity) o;

        if (likedPostId != null ? !likedPostId.equals(that.likedPostId) : that.likedPostId != null) return false;
        if (userr != null ? !userr.equals(that.userr) : that.userr != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = likedPostId != null ? likedPostId.hashCode() : 0;
        result = 31 * result + (userr != null ? userr.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }
}
