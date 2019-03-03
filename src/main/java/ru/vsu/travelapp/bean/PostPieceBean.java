package ru.vsu.travelapp.bean;

public class PostPieceBean {
    /*private String text;
    private String attachment;
    //private Integer place;
    private PlaceBean place;*/

    private Integer pieceId;
    private PostBean post;
    private PlaceBean place;
    private String textt;

    /*public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }*/

    /*public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }*/

    public PlaceBean getPlace() {
        return place;
    }

    public void setPlace(PlaceBean place) {
        this.place = place;
    }

    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    public PostBean getPost() {
        return post;
    }

    public void setPost(PostBean post) {
        this.post = post;
    }

    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }
}
