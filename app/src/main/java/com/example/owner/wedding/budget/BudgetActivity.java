package com.example.owner.wedding.budget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.owner.wedding.R;

import java.util.List;

public class BudgetActivity extends AppCompatActivity {

    /*TODO:
     * 1) data structure for planned budget (use same Class BudgetEntry - only 1 for each category - fields: category, cost, comments
     * 2) data structure for spent budget
     */

    List<List<BudgetEntry>> budgetCategories;

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
