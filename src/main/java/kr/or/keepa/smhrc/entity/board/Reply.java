package kr.or.keepa.smhrc.entity.board;

import java.util.Date;

public class Reply {
    private int rno;
    private int bno;
    private String rContent;
    private String rWriter;
    private Date rCreatedDate;
    private Date rUpdatedDate;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getRContent() {
        return rContent;
    }

    public void setRContent(String rContent) {
        this.rContent = rContent;
    }

    public String getRWriter() {
        return rWriter;
    }

    public void setRWriter(String rWriter) {
        this.rWriter = rWriter;
    }

    public Date getRCreatedDate() {
        return rCreatedDate;
    }

    public void setRCreatedDate(Date rCreatedDate) {
        this.rCreatedDate = rCreatedDate;
    }

    public Date getRUpdatedDate() {
        return rUpdatedDate;
    }

    public void setRUpdatedDate(Date rUpdatedDate) {
        this.rUpdatedDate = rUpdatedDate;
    }
}
