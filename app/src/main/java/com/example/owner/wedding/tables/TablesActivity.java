package com.example.owner.wedding.tables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.owner.wedding.R;
import com.example.owner.wedding.guests.Guest;

import java.util.ArrayList;
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
    /*First Table is always the EXTRAS Table*/


    private List<Table> populateListInTables(List<Guest> guestList, List<Table> tableList){
        //TODO: should i clone guestList first???

        List<Table> answer = new ArrayList<>();
        Table extras = new Table(0,99);

        for (Guest guest : guestList) {
            for (Table table : tableList) {

            }
        }

        /*extras' table is the first table*/
        answer.add(0,extras);

        return answer;
    }

}
