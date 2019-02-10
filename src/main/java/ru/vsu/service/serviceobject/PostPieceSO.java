package ru.vsu.service.serviceobject;

import ru.vsu.database.entity.PlaceEntity;
import ru.vsu.database.entity.PostEntity;

import java.util.Objects;

public class PostPieceSO {
    private Integer pieceId;
    private PostEntity post;
    private PlaceEntity place;
    private String textt;

    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity post) {
        this.post = post;
    }

    public PlaceEntity getPlace() {
        return place;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }

    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostPieceSO that = (PostPieceSO) o;
        return Objects.equals(pieceId, that.pieceId) &&
                Objects.equals(post, that.post) &&
                Objects.equals(place, that.place) &&
                Objects.equals(textt, that.textt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceId, post, place, textt);
    }
}
