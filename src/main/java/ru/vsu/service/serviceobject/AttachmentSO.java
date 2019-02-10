package ru.vsu.service.serviceobject;

import java.util.Objects;

public class AttachmentSO {
    private Integer attachmentId;
    private String fileName;
    private Integer pieceId;

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachmentSO that = (AttachmentSO) o;
        return Objects.equals(attachmentId, that.attachmentId) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(pieceId, that.pieceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentId, fileName, pieceId);
    }
}
