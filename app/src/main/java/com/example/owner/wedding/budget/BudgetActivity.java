package com.example.owner.wedding.budget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.owner.wedding.R;

import java.util.List;

public class BudgetActivity extends AppCompatActivity {

    /*TODO:
     * 1) data structure for planned budget (use same Class BudgetEntry - only 1 for each category - fields: category, cost, comments
     * 2) data structure for spent budget
     */

    Button newExpenseBtn;
    //BudgetEntry[] budgetEntries;

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //budgetCategories = getBudgetCategories_DB();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        newExpenseBtn = (Button)findViewById(R.id.budget_newExpense);
        newExpenseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BudgetActivity.this, EditBudgetEntryActivity.class);
                startActivity(intent);
            }
        });

        ListView listView = (ListView)findViewById(R.id.list_view);
        /*TODO:TESTING ONLY*/
        BudgetEntry[] budgetEntries = {new BudgetEntry(1,"חליפת חתן",1500), new BudgetEntry(1,"חליפת חתן",23), new BudgetEntry(1,"בייביסיטר לחתול",180),
                new BudgetEntry(1,"עניבה",2345), new BudgetEntry(1,"קישוטי רכב",130), new BudgetEntry(1,"סידורי פרחים",1500), new BudgetEntry(1,"די ג'יי",1600),
                new BudgetEntry(1,"גן הורדים",22000), new BudgetEntry(1,"זר כלה",250), new BudgetEntry(1,"מקווה",18), new BudgetEntry(1,"צלם סטילס",1850),
                new BudgetEntry(1,"פיצוחים",150), new BudgetEntry(1,"טבעות",1350), new BudgetEntry(1,"אקום",238), new BudgetEntry(1,"צלם וידאו",2200),
                new BudgetEntry(1,"רב",1200), new BudgetEntry(1,"שמלה כלה",7500), new BudgetEntry(1,"הזמנות",420), new BudgetEntry(1,"אבטחה",500),
                new BudgetEntry(1,"מוישה לאופר",112000), new BudgetEntry(1,"שוחד",1322), new BudgetEntry(1,"מעטפות",84), new BudgetEntry(1,"שומרים בחניון",650)};


       // BudgetEntry[] budgetEntries = {new BudgetEntry(1,"חליפת חתן",1500), new BudgetEntry(1,"חליפת חתן",23)};
        /*TODO:TESTING ONLY*/

        BudgetListAdapter adapter = new BudgetListAdapter(this,budgetEntries);
        listView.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_budget, menu);
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

    private int totalCost(List<BudgetEntry> budgetEntries){
        int cost = 0;
        for (BudgetEntry budgetEntry : budgetEntries){
            cost += budgetEntry.getCost();
        }

        return cost;

    }

    private void saveBudget(){}
    private void loadBudget(){}
    /*List of categories - sub lists of items per category. Show only categories with planned cost*/
    //private List<List<BudgetEntry>> getBudgetCategories_DB() {}
}
