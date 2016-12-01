package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom adapter for list items within the app
 *
 * Created by osborne on 11/29/2016.
 */

public class TourItemAdapter extends ArrayAdapter<TourItem> {

    /** Used to set background color for each page **/
    private int mBackgroundColor;

    /**
     * Constructor which is called when adapter created
     *
     * @param context
     * @param arrayList
     * @param aBackgroundColor is used to set the background color for the page
     */
    public TourItemAdapter(Context context, ArrayList<TourItem> arrayList, int aBackgroundColor) {
        super(context, 0, arrayList);
        mBackgroundColor = aBackgroundColor;

    }

    /**
     * Connects the TourItem object to the xml layout
     *
     * @param position of the ListView
     * @param convertView
     * @param parent
     * @return the complete listitem for the ListView
     */
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

        // Set the background color of each page
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.icon_image);
        imageView.setBackgroundColor(color);
        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.title_and_description_container);
        linearLayout.setBackgroundColor(color);
        itemAddress.setBackgroundColor(color);


        return listItemView;
    }

}
