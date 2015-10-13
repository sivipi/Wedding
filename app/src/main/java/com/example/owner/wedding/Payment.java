package com.example.owner.wedding;

import java.util.Date;

/**
 * Created by Sivan on 11/10/2015.
 */
public class Payment implements Comparable<Payment>{

    /*default values*/
    private Date date = new Date();
    private int amount = 0; // TODO: can be TBD
    private int method = 1; // cash, credit, check TODO: DB- INIT METHOD_CASH
    private int status;
    private String comments = "";
    private Date checkDate; //for postponed cheques only

    /*Cash or Credit*/
    public Payment(int amount, int method, String comments) {
        this.status = getDefaultStatus();
        this.amount = amount;
        this.method = method;
        this.comments = comments;
    }

    /*Cheque*/
    public Payment(int amount, int method, String comments, Date checkDate) {
        this.status = getDefaultStatus();
        this.amount = amount;
        this.method = method;
        this.comments = comments;
        this.checkDate = checkDate; //for postponed cheques only
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

    @Override
    public int compareTo(Payment another) {
        return date.compareTo(another.getDate());
    }

    /*Default will be determined by this.date*/
    private int getDefaultStatus() {
        Date now = new Date();
        if (now.before(date))
            return 1;//Todo: DB-STATUS_NOT_PAID
        else
            return 1;//TODO: DB-STATUS-PAID
    }
}
