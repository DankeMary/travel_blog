package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.PostEntity;
import ru.vsu.database.entity.UserrEntity;

import java.util.Objects;

public class LikedPostSO {
    private Integer likedPostId;
    private UserrEntity userr;
    private PostEntity post;

    public Integer getLikedPostId() {
        return likedPostId;
    }

    public void setLikedPostId(Integer likedPostId) {
        this.likedPostId = likedPostId;
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
        LikedPostSO that = (LikedPostSO) o;
        return Objects.equals(likedPostId, that.likedPostId) &&
                Objects.equals(userr, that.userr) &&
                Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(likedPostId, userr, post);
    }
}
