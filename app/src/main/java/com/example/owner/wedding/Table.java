package com.example.owner.wedding;

import java.util.List;

/**
 * Created by Ram on 10/11/2015.
 */
public class Table {

    private List<Guest> tableMembers;
    private int maxNumOfGuests;
    private int tableNumber;
    private int tableType;

    //TODO addGuest,removeGuest,changeTableNumber,numOfOccupiedPlaces

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Table(int tableNumber, int numOfMembers) {
        this(tableNumber;
        this.maxNumOfGuests = numOfMembers;
    }

    //getters
    public int getTableNumber() {
        return tableNumber;
    }

    public List<Guest> getTableMembers() {
        return tableMembers;
    }

    public int getNumOfMembers() {
        return maxNumOfGuests;
    }


    //setters
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTableMembers(Guest[] tableMembers) {
        this.tableMembers = tableMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.maxNumOfGuests = numOfMembers;
    }


    /* Add new guest to the current table */
    public void addGuestToTable(Guest guest) {
        this.tableMembers.
    }


}
