package ru.vsu.database.entity;

import javax.persistence.*;

@Entity
@Table(name = "attachment", schema = "blog_db")
public class AttachmentEntity {
    private Integer attachmentId;
    private String fileName;
    private Integer pieceId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attachment_id")
    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    @Column(name = "piece_id")
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

        AttachmentEntity that = (AttachmentEntity) o;

        if (attachmentId != null ? !attachmentId.equals(that.attachmentId) : that.attachmentId != null) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (pieceId != null ? !pieceId.equals(that.pieceId) : that.pieceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attachmentId != null ? attachmentId.hashCode() : 0;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (pieceId != null ? pieceId.hashCode() : 0);
        return result;
    }
}
