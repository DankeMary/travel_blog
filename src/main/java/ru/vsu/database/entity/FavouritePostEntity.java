package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "favourite_post", schema = "blog_db")
public class FavouritePostEntity {
    private Integer favPostId;
    private UserrEntity userr;
    private PostEntity post;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fav_post_id")
    public Integer getFavPostId() {
        return favPostId;
    }

    public void setFavPostId(Integer favPostId) {
        this.favPostId = favPostId;
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

        FavouritePostEntity that = (FavouritePostEntity) o;

        if (favPostId != null ? !favPostId.equals(that.favPostId) : that.favPostId != null) return false;
        if (userr != null ? !userr.equals(that.userr) : that.userr != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = favPostId != null ? favPostId.hashCode() : 0;
        result = 31 * result + (userr != null ? userr.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }
}
