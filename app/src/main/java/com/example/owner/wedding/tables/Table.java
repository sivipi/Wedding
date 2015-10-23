package com.example.owner.wedding.tables;

import com.example.owner.wedding.guests.Guest;

import java.util.List;

/**
 * Created by Ram on 10/11/2015.
 */
public class Table {

    private List<Guest> tableMembers;
    private int maxNumOfGuests;
    private int tableNumber;
    private String tabbleName;
    private int tableType;

    //TODO addGuest,removeGuest,changeTableNumber,numOfOccupiedPlaces

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Table(int tableNumber, int numOfMembers) {
        this(tableNumber);
        this.maxNumOfGuests = numOfMembers;
    }

    //getters
    public int getTableNumber() {
        return tableNumber;
    }

    public List<Guest> getTableMembers() {
        return tableMembers;
    }

    //setters
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTableMembers(List<Guest> tableMembers) {
        this.tableMembers = tableMembers;
    }

    /* Add new guest to the current table */
    public void addGuestToTable(Guest guest) {
        this.tableMembers.add(guest);
    }

    public int getMaxNumOfGuests() {
        return maxNumOfGuests;
    }

    public void setMaxNumOfGuests(int maxNumOfGuests) {
        this.maxNumOfGuests = maxNumOfGuests;
    }

    public String getTabbleName() {
        return tabbleName;
    }

    public void setTabbleName(String tabbleName) {
        this.tabbleName = tabbleName;
    }
}
