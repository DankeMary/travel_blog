package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.PostEntity;
import ru.vsu.database.entity.UserrEntity;

import java.util.Objects;

public class FavouritePostSO {
    private Integer favPostId;
    private UserrEntity userr;
    private PostEntity post;

    public Integer getFavPostId() {
        return favPostId;
    }

    public void setFavPostId(Integer favPostId) {
        this.favPostId = favPostId;
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
        FavouritePostSO that = (FavouritePostSO) o;
        return Objects.equals(favPostId, that.favPostId) &&
                Objects.equals(userr, that.userr) &&
                Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favPostId, userr, post);
    }
}
