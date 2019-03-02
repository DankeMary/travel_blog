package ru.vsu.travelapp.bean;

public class PostPieceBean {
    private String text;
    private String attachment;
    private String place;
    //private PlaceBean place;

    public String getText() {
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
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    /*public PlaceBean getPlace() {
        return place;
    }

    public void setPlace(PlaceBean place) {
        this.place = place;
    }*/
}
