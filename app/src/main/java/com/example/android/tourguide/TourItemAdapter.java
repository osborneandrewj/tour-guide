package com.example.android.tourguide;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Custom adapter for list items within the app
 *
 * Created by osborne on 11/29/2016.
 */

public class TourItemAdapter extends ArrayAdapter<TourItem> {

    /**
     * Used to set background color for each page
     **/
    private int mBackgroundColor;

    /**
     * Constructor which is called when adapter created
     *
     * @param aBackgroundColor is used to set the background color for the page
     */
    public TourItemAdapter(Context context, ArrayList<TourItem> arrayList, int aBackgroundColor) {
        super(context, 0, arrayList);
        mBackgroundColor = aBackgroundColor;

    }

    /**
     * Connects the TourItem object to the xml layout
     *
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
        // Set the appropriate text for each part of the list item
        TextView itemTitle = (TextView) listItemView.findViewById(R.id.item_title);
        itemTitle.setText(tourItem.getTourItemTitle());
        TextView itemDescription = (TextView) listItemView.findViewById(R.id.item_description);
        itemDescription.setText(tourItem.getTourItemDescription());

        // These TextViews will be set based on the following 'if' statement
        TextView itemHours = (TextView) listItemView.findViewById(R.id.item_hours);
        TextView isOpen = (TextView) listItemView.findViewById(R.id.item_open);

        // Sets room availability and price if item is a hotel
        if (tourItem.isHotel()) {
            // Set the hotel price
            itemHours.setText(getContext().getString(R.string.dollar_currency) + tourItem.getHotelPrice());
            // Move the text to the right side of screen
            itemHours.setGravity(Gravity.END);
            //set room availability status
            if (tourItem.getIsOpen()) {
                // If rooms available, set text to reflect this
                isOpen.setText(getContext().getString(R.string.rooms_available_text));
                // Set text color to green
                isOpen.setTextColor(Color.parseColor("#388e3c"));
            } else {
                // If no room available set hotel status to full
                isOpen.setText(getContext().getString(R.string.rooms_not_available_text));
                // Set text color to red
                isOpen.setTextColor(Color.parseColor("#ff5252"));
            }
        } else {
            // If the item is not a hotel set open/closed and hours text instead
            itemHours.setText(tourItem.getmTourItemHours());
            // The following sets the open/closed text and text color
            if (tourItem.getIsOpen()) {
                // If item is open, reflect this in text and set text color to blue
                isOpen.setText(getContext().getString(R.string.open_text));
                // Set text color to blue
                isOpen.setTextColor(Color.parseColor("#303f9f"));
            } else {
                // If item is closed, reflect this in text and set text color to red
                isOpen.setText(getContext().getString(R.string.closed_text));
                // Set text color to red
                isOpen.setTextColor(Color.parseColor("#ff5252"));
            }
        }

        // Set the icon image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image);
        if (tourItem.hasImage()) {
            imageView.setImageResource(tourItem.getImageResourceId());
        } else {
            //if no image provided, remove ImageView
            imageView.setVisibility(View.GONE);
        }


        // Set the background color of each item on the page
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        imageView.setBackgroundColor(color);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.title_and_description_container);
        linearLayout.setBackgroundColor(color);


        return listItemView;
    }

}
