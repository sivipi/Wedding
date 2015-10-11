package com.example.owner.wedding;

import java.util.List;

/**
 * Created by Sivan on 11/10/2015.
 */
public class BudgetEntry {

    int category;
    String item;
    int cost;
    List<Payment> paymentList;

    public BudgetEntry(int category, String item, int cost) {
        this.category = category;
        this.item = item;
        this.cost = cost;
    }

    public BudgetEntry(int category, String item, int cost, List<Payment> paymentList) {
        this.category = category;
        this.item = item;
        this.cost = cost;
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
}
