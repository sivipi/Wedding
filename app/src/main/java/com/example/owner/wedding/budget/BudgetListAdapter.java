package com.example.owner.wedding.budget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.owner.wedding.R;

import java.util.List;

/**
 * Created by owner on 01/11/2015.
 */
public class BudgetListAdapter extends BaseAdapter {

    private Context context;
    private BudgetEntry[] budgetEntries;

    final int ENTRY_TYPES = 2;
    final int TYPE_PAYMENTS = 0;
    final int TYPE_NO_PAYMENTS = 1;

    public BudgetListAdapter(Context context, BudgetEntry[] budgetEntries) {
        super();
        this.context = context;
        this.budgetEntries = budgetEntries;

    }

    @Override
    public int getCount() {
        return budgetEntries.length;
    }

    @Override
    public BudgetEntry getItem(int position) {
        return budgetEntries[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final BudgetEntry data = getItem(position);
        ImageButton plusBtn = null;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if(data.hasPayments()){
                convertView = inflater.inflate(R.layout.line_budget_entry_payments,null);
                plusBtn = (ImageButton)convertView.findViewById(R.id.line_edit);
            }
            else convertView = inflater.inflate(R.layout.line_budget_entry,null);
        }

        TextView costTv = (TextView)convertView.findViewById(R.id.line_cost);
        TextView itemTv = (TextView)convertView.findViewById(R.id.line_item);
        LinearLayout linearLayout = (LinearLayout)convertView.findViewById(R.id.budget_adapter_linear_layout);

        costTv.setText(data.toString());
        itemTv.setText(data.getItem());

        if (data.hasPayments()) {
            assert plusBtn != null;
            plusBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /*Dynamically add payments rows*/
                    if (data.hasPayments()){
                        for (Payment payment : data.getPaymentList()){
                            TextView paymentAmountTv = new TextView(context);
                            //TODO: complete
                        }
                    }
                }
            });
        }

        return convertView;
    }


    @Override
    public int getViewTypeCount() {
        return ENTRY_TYPES;
    }

    @Override
    public int getItemViewType(int position) {
        return budgetEntries[position].hasPayments() ? TYPE_PAYMENTS : TYPE_NO_PAYMENTS;
    }
}
