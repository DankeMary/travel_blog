package ru.vsu.travelapp.bean;

import java.util.ArrayList;

public class PostBean {
    private String title;
    private ArrayList<PostPieceBean> postPieces;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<PostPieceBean> getPostPieces() {
        return postPieces;
    }

    public void setPostPieces(ArrayList<PostPieceBean> postPieces) {
        this.postPieces = postPieces;
    }
}
