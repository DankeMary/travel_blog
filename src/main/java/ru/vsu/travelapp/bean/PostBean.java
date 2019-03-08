package ru.vsu.travelapp.bean;

import ru.vsu.database.entity.UserrEntity;

import java.sql.Timestamp;
import java.util.ArrayList;

public class PostBean {
    /*private String title;
    private ArrayList<PostPieceBean> postPieces;*/

    private Integer postId;
    private String title;
    private String textt;
    private Timestamp createdOn;
    private UserrEntity userr;
    private Byte onCheck;
    private Byte approved;
    private String commentary;
    private ArrayList<PostPieceBean> postPieces;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextt() {
        return textt;
    }

    public void setTextt(String textt) {
        this.textt = textt;
    }

    public ArrayList<PostPieceBean> getPostPieces() {
        return postPieces;
    }

    public void setPostPieces(ArrayList<PostPieceBean> postPieces) {
        this.postPieces = postPieces;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public UserrEntity getUserr() {
        return userr;
    }

    public void setUserr(UserrEntity userr) {
        this.userr = userr;
    }

    public Byte getOnCheck() {
        return onCheck;
    }

    public void setOnCheck(Byte onCheck) {
        this.onCheck = onCheck;
    }

    public Byte getApproved() {
        return approved;
    }

    public void setApproved(Byte approved) {
        this.approved = approved;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
