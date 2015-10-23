package com.example.owner.wedding;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import com.example.owner.wedding.budget.BudgetActivity;
import com.example.owner.wedding.calendar.CalendarActivity;
import com.example.owner.wedding.guests.Guest;
import com.example.owner.wedding.login.LoginActivity;
import com.example.owner.wedding.vendors.VendorsActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton budgetBtn = (ImageButton)findViewById(R.id.budget_btn);
        final ImageButton vendorsBtn = (ImageButton)findViewById(R.id.vendors_btn);
        final ImageButton calendarBtn = (ImageButton)findViewById(R.id.calendar_btn);
        final ImageButton guestsBtn = (ImageButton)findViewById(R.id.guests_btn);

        /*Listeners for the ImageButtons*/

        budgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BudgetActivity.class);
                startActivity(intent);
            }
        });

        vendorsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VendorsActivity.class);
                startActivity(intent);
            }
        });

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        guestsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BudgetActivity.class);
                startActivity(intent);
            }
        });

    }



//Comment for testing
    //another check
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();

        /*Check Login Status*/
        SharedPreferences sp = getPreferences(Activity.MODE_PRIVATE);
        int user_id;
        if ((user_id=sp.getInt("user_id", -1)) == -1){ //First Login
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        } else {
            //TODO: get All unapproved tasks - if there are some: fragment
            List<Guest> unGuests = new ArrayList<>();
            List<Guest> unBudgetEntries = new ArrayList<>();
            List<Guest> unCalendar = new ArrayList<>();
            List<Guest> unVendors = new ArrayList<>();
            List<Guest> unTables = new ArrayList<>();

            int totalTasks = 0;
            totalTasks += unGuests.size() + unBudgetEntries.size() + unCalendar.size() + unVendors.size() + unTables.size();

            if (totalTasks != 0){
                //TODO: build accepting fragment - right/left swipe. Doesn't have to accept!
            }
        }
    }
}
