package com.example.owner.wedding;

import java.util.Date;

/**
 * Created by Sivan on 11/10/2015.
 */
public class Payment {
    private Date date; //TODO: can be TBD - decide what represents TDB
    private int status;
    private int amount; // TODO: can be TBD
    private int method; // cash, credit, check
    private Date checkDate; //for postponed cheques only
    private String comments;

    public Payment(Date date, int status, int amount, int method, String comments) {
        this.date = date;
        this.status = status;
        this.amount = amount;
        this.method = method;
        this.comments = comments;
    }

    public Payment(Date date, int status, int amount, int method) {
        this.date = date;
        this.status = status;
        this.amount = amount;
        this.method = method;
    }

    public Payment(Date date, int status, int amount, int method, Date checkDate, String comments) {
        this.date = date;
        this.status = status;
        this.amount = amount;
        this.method = method;
        this.checkDate = checkDate;
        this.comments = comments;
    }

    public Payment(Date date, int status, int amount, int method, Date checkDate) {
        this.date = date;
        this.status = status;
        this.amount = amount;
        this.method = method;
        this.checkDate = checkDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMethod() {
        return method;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
