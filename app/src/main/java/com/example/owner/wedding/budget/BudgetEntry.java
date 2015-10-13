package com.example.owner.wedding.budget;

import java.util.Collections;
import java.util.List;

/**
 * Created by Sivan on 11/10/2015.
 */
public class BudgetEntry {

    private int category;
    private String item;
    private int cost;
    private List<Payment> paymentList; /*Will always be sorted by dates*/
    String comments = "";

    /*Cash or credit*/
    public BudgetEntry(int category, String item, int cost) {
        this.category = category;
        this.item = item;
        this.cost = cost;
    }

    /*Cheques*/
    public BudgetEntry(int category, String item, List<Payment> paymentList) {
        this.category = category;
        this.item = item;
        this.cost = getCostFromPaymentList(paymentList);
        this.paymentList = paymentList;
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
        Collections.sort(paymentList);
    }

    public void deletePayment(Payment payment){
        paymentList.remove(payment);
    }

    private int getCostFromPaymentList(List<Payment> paymentList) {
        int cost = 0;
        for (Payment payment : paymentList){
            cost += payment.getAmount();
        }
        return cost;
    }

}
