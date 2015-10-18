package com.example.owner.wedding.tables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.owner.wedding.R;
import com.example.owner.wedding.guests.Guest;

import java.util.Comparator;
import java.util.List;

public class TablesActivity extends AppCompatActivity {

    List<Table> tableList; //TODO: get from DB + make default
    List<List<Guest>> guestsByCategoryList; //TODO: get from DB

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
    }

    /*TODO: Seating arrangements algorithm needs to thought through together*/
//    private void seatingArrangements (List<List<Guest>> guestsCategoryList, List<Table> tableList){
//
//        for (List<Guest> guestsInCategory : guestsCategoryList) {
//
//        }
//
//    }

    private List<Guest> populateCategoryInTables

    private class TableSizeComparator implements Comparator<Table> {

        @Override
        public int compare(Table lhs, Table rhs) {

            int lhsMaxNumberOfGuests = lhs.getMaxNumOfGuests();
            int rhsMaxNumberOfGuests = rhs.getMaxNumOfGuests();

            return Integer.compare(lhsMaxNumberOfGuests,rhsMaxNumberOfGuests);
        }
    }

    private class TableFreePlacesComparator implements Comparator<Table> {

        @Override
        public int compare(Table lhs, Table rhs) {

            int lhsGuestsLeft = lhs.getMaxNumOfGuests() - lhs.getTableMembers().size();
            int rhsGuestsLeft = rhs.getMaxNumOfGuests() - rhs.getTableMembers().size();

            return Integer.compare(lhsGuestsLeft,rhsGuestsLeft);

        }
    }
}
