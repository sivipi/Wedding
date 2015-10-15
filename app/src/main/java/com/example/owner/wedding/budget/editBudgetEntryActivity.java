package com.example.owner.wedding.budget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Spinner;

import com.example.owner.wedding.R;

import java.util.Date;
import java.util.List;

/*TODO: Make if work ok for edit budget entries*/
public class editBudgetEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_budget_entry);

        Date date = new Date();
        //final BudgetEntry budgetEntry;
        final int numOfPayments = 1;

//        private int category;
//        private String item;
//        private int cost;
//        private List<Payment> paymentList; /*Will always be sorted by dates*/
//        String comments = "";

        final Spinner categorySpinner = (Spinner)findViewById(R.id.budget_category);
        final EditText commentsText = (EditText)findViewById(R.id.budget_comments);
        final EditText itemText = (EditText)findViewById(R.id.budget_item);
        final EditText costText = (EditText)findViewById(R.id.budget_cost);
        Spinner paymentsSpinner = (Spinner)findViewById(R.id.budget_payments_amount);
        Button addButton = (Button)findViewById(R.id.budget_add_button);
        Button cancelButton = (Button)findViewById(R.id.budget_cancel_button);
        final NumberPicker daysPicker = (NumberPicker)findViewById(R.id.budget_daysPicker);
        final NumberPicker monthsPicker = (NumberPicker)findViewById(R.id.budget_monthsPicker);
        final NumberPicker yearsPicker = (NumberPicker)findViewById(R.id.budget_yearsPicker);

        daysPicker.setMinValue(1);
        daysPicker.setMaxValue(31);
        monthsPicker.setMinValue(1);
        monthsPicker.setMaxValue(12);
        yearsPicker.setMinValue(2000);
        yearsPicker.setMaxValue(2050);
        daysPicker.setValue(date.getDay());
        monthsPicker.setValue(date.getMonth());
        yearsPicker.setValue(date.getYear());

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date date = new Date(yearsPicker.getValue() - 1900, monthsPicker.getValue() - 1, daysPicker.getValue());
                int cost = Integer.parseInt(costText.getText().toString());
                String item = itemText.getText().toString();
                int category = Integer.parseInt(categorySpinner.getSelectedItem().toString());
                String comments = commentsText.getText().toString();
                int paymentsAmount = numOfPayments;

                if (cost == 1 || item.length() == 0) {/*TODO: add condition for category-not-selected*/
                    /*TODO: alert the user to fill the needed fields*/
                } else { /*if fields are filled OK*/
                    BudgetEntry budgetEntry = new BudgetEntry(category, item, cost);
                    budgetEntry.setComments(comments);
                    budgetEntry.setDate(date);
                    /*TODO: add the payments list to the budgetEntry*/
                }
            }
        });

        paymentsSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO: complete
            }
        });

    }
}