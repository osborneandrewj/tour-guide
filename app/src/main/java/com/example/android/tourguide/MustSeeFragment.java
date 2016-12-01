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
public class MustSeeFragment extends Fragment {


    public MustSeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create an ArrayList and populate it with TourItem custom objects
        final ArrayList<TourItem> tourItemsList = new ArrayList<>();

        tourItemsList.add(new TourItem(getString(R.string.must_see_1),
                getString(R.string.must_see_1_description),
                getString(R.string.must_see_1_address)));
        tourItemsList.add(new TourItem(getString(R.string.must_see_2),
                getString(R.string.must_see_2_description),
                getString(R.string.must_see_2_address)));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Hours:     Open now    9AM-12AM"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));

        // Construct a custom ArrayAdapter and give it tourItemsList ArrayList
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getActivity(), tourItemsList, R.color.fragment_background);

        // Create a ListView and set the custom ArrayAdapter as its adapter
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);

        return rootView;
    }

}
