package com.mhodges.demo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class DoggoAdapter extends ArrayAdapter<Doggo> {

    private ArrayList<Doggo> items;

    public DoggoAdapter(Context context, int textViewResourceId, ArrayList<Doggo> items) {
        super(context, textViewResourceId, items);
        this.items = items;
    }

    //This method is called once for every item in the ArrayList as the list is loaded.
    //It returns a View -- a list item in the ListView -- for each item in the ArrayList
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.list_item, null);
        }
        Doggo o = items.get(position);
        if (o != null) {
            TextView tt = (TextView) v.findViewById(R.id.toptext);
            TextView bt = (TextView) v.findViewById(R.id.bottomtext);
            TextView trdt = (TextView) v.findViewById(R.id.thirdText);
            TextView ft = (TextView) v.findViewById(R.id.forthText);

            if (tt != null) {
                tt.setText(o.getName());
            }
            if (bt != null) {
                bt.setText("Age: " + o.getAge());
            }
            if (trdt != null) {
                trdt.setText("Height: " + o.getHeight());
            }
            if (ft != null) {
                ft.setText("Weight: " + o.getWeight());
            }
        }
        return v;
    }
}
