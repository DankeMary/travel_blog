package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "post_piece", schema = "blog_db")
public class PostPieceEntity {
    private Integer pieceId;
    private PostEntity post;
    private PlaceEntity place;
    private String textt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piece_id")
    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    @ManyToOne
    @Column(name = "post_id")
    public PostEntity getPost() {
        return post;
    }

    public void setPost(PostEntity post) {
        this.post = post;
    }

    @ManyToOne
    @Column(name = "place_id")
    public PlaceEntity getPlace() {
        return place;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }

    
    @Column(name = "textt")
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

        PostPieceEntity that = (PostPieceEntity) o;

        if (pieceId != null ? !pieceId.equals(that.pieceId) : that.pieceId != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (textt != null ? !textt.equals(that.textt) : that.textt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pieceId != null ? pieceId.hashCode() : 0;
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (textt != null ? textt.hashCode() : 0);
        return result;
    }
}
