package com.example.owner.wedding;

/**
 * Created by Ram on 10/11/2015.
 */
public class Table {

    private Guest[] tableMembers;
    private int numOfMembers;
    private int tableNumber;

    //TODO addGuest,removeGuest,changeTableNumber


    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Table(int numOfMembers, int tableNumber) {
        this(tableNumber);
        this.numOfMembers = numOfMembers;
    }

    public Table(Guest[] tableMembers, int numOfMembers, int tableNumber) {
        this(numOfMembers,tableNumber);
        this.tableMembers = tableMembers;
    }

    //getters
    public int getTableNumber() {
        return tableNumber;
    }

    public Guest[] getTableMembers() {
        return tableMembers;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    //setters
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTableMembers(Guest[] tableMembers) {
        this.tableMembers = tableMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = guest;
    }


}
