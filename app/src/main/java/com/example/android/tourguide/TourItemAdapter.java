package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom adapter for list items within the app
 *
 * Created by osborne on 11/29/2016.
 */

public class TourItemAdapter extends ArrayAdapter<TourItem> {

    /**
     * Constructor which is called when adapter created
     *
     * @param context
     * @param arrayList
     */
    public TourItemAdapter(Context context, ArrayList<TourItem> arrayList) {
        super(context, 0, arrayList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the inflater and inflate the xml
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //get the object we are displaying
        TourItem tourItem = getItem(position);

        TextView itemTitle = (TextView)listItemView.findViewById(R.id.item_title);
        itemTitle.setText(tourItem.getTourItemTitle());
        TextView itemDescription = (TextView)listItemView.findViewById(R.id.item_description);
        itemDescription.setText(tourItem.getTourItemDescription());
        TextView itemAddress = (TextView)listItemView.findViewById(R.id.item_address);
        itemAddress.setText(tourItem.getmTourItemAddress());

        return listItemView;
    }

}
