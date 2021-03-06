package com.example.owner.wedding.budget;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/**
 * Created by Sivan on 11/10/2015.
 */
public class BudgetEntry implements Comparable<BudgetEntry>{

    Calendar date = Calendar.getInstance();
    private int category;
    private String item;
    private int cost;
    private List<Payment> paymentList; /*Will always be sorted by dates*/
    String comments = "";

    /* Spent - Cash or credit*/
    public BudgetEntry(int category, String item, int cost) {
        this.category = category;
        this.item = item;
        this.cost = cost;
    }

    /*Spent - Cheques*/
    public BudgetEntry(int category, String item, List<Payment> paymentList) {
        this.category = category;
        this.item = item;
        this.cost = getCostFromPaymentList(paymentList);
        this.paymentList = paymentList;
    }

    /*Planned - use for planned budget*/
    public BudgetEntry(int category, int cost, String comments) {
        this.category = category;
        this.cost = cost;
        this.comments = comments;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getYear(){
        return date.get(Calendar.YEAR)+1900;
    }

    /*January is 0*/
    public int getMonth() {
        return 1 + date.get(Calendar.MONTH);
    }

    public int getDay() {
        return date.get(Calendar.DAY_OF_MONTH);
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /*Will add a payment in the end of paymentList*/
    public void addPayment(Payment payment) {
        paymentList.add(payment);
        this.cost += payment.getAmount();
        Collections.sort(paymentList);
    }

    public void deletePayment(Payment payment){
        this.cost -= payment.getAmount();
        paymentList.remove(payment);
    }

    private int getCostFromPaymentList(List<Payment> paymentList) {
        int cost = 0;
        for (Payment payment : paymentList){
            cost += payment.getAmount();
        }
        return cost;
    }

    @Override
    public String toString() {
        return NumberFormat.getNumberInstance(Locale.US).format(this.cost);
    }

    @Override
    public int compareTo(BudgetEntry another) {
        return this.date.compareTo(another.date);
    }

    public boolean hasPayments(){
        if (paymentList==null) return false;
        return (paymentList.size()>0);
    }
}
