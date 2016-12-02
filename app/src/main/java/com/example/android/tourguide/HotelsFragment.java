package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create an ArrayList and populate it with TourItem custom objects
        final ArrayList<TourItem> tourItemsList = new ArrayList<>();

        tourItemsList.add(new TourItem(getString(R.string.hotel_1),
                getString(R.string.hotel_1_description),
                null,
                true,
                R.drawable.shangri_la,
                true,
                1074));
        tourItemsList.add(new TourItem(getString(R.string.hotel_5),
                getString(R.string.hotel_5_description),
                null,
                true,
                R.drawable.bed,
                true,
                529));
        tourItemsList.add(new TourItem(getString(R.string.hotel_3),
                getString(R.string.hotel_3_description),
                null,
                true,
                R.drawable.bed,
                true,
                569));
        tourItemsList.add(new TourItem(getString(R.string.hotel_4),
                getString(R.string.hotel_4_description),
                null,
                false,
                R.drawable.bed,
                true,
                594));
        tourItemsList.add(new TourItem(getString(R.string.hotel_6),
                getString(R.string.hotel_6_description),
                null,
                true,
                R.drawable.bed,
                true,
                540));
        tourItemsList.add(new TourItem(getString(R.string.hotel_2),
                getString(R.string.hotel_2_description),
                null,
                false,
                R.drawable.bed,
                true,
                1487));


        // Construct a custom ArrayAdapter and give it tourItemsList ArrayList
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getActivity(), tourItemsList, R.color.fragment_background);

        // Create a ListView and set the custom ArrayAdapter as its adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);

        return rootView;
    }

}
