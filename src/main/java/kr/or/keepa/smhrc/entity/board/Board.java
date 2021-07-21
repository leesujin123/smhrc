package kr.or.keepa.smhrc.entity.board;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int bno;
    private String title;
    private String content;
    private int hitCnt;
    private String writer;
    private Date createdDate;
    private Date updatedDate;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getHitCnt() {
        return hitCnt;
    }

    public void setHitCnt(int hitCnt) {
        this.hitCnt = hitCnt;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
