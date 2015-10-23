package com.example.owner.wedding.tables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.owner.wedding.R;
import com.example.owner.wedding.guests.Guest;

import java.util.Comparator;

/**
 * Created by oferh_000 on 10/23/2015.
 */
public class TableSeatingAlg {
    public static void TableSeatingAlg(List<List<Guest>> guestsCategoryList, List<Table> tableList, Object restriction){

    }

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
