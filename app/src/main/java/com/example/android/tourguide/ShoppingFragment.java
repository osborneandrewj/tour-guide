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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create an ArrayList and populate it with TourItem custom objects
        final ArrayList<TourItem> tourItemsList = new ArrayList<>();

        tourItemsList.add(new TourItem(getString(R.string.shopping_1),
                getString(R.string.shopping_1_description),
                getString(R.string.shopping_2_hours),
                true,
                R.drawable.champs_elysees
        ));
        tourItemsList.add(new TourItem(getString(R.string.shopping_2),
                getString(R.string.shopping_2_description),
                getString(R.string.shopping_2_hours),
                true,
                R.drawable.credit_card
        ));
        tourItemsList.add(new TourItem(getString(R.string.shopping_3),
                getString(R.string.shopping_3_description),
                getString(R.string.shopping_3_hours),
                true,
                R.drawable.credit_card
        ));
        tourItemsList.add(new TourItem(getString(R.string.shopping_4),
                getString(R.string.shopping_4_description),
                getString(R.string.shopping_4_hours),
                true,
                R.drawable.credit_card
        ));
        tourItemsList.add(new TourItem(getString(R.string.shopping_5),
                getString(R.string.shopping_5_description),
                getString(R.string.shopping_5_hours),
                true,
                R.drawable.credit_card
        ));
        tourItemsList.add(new TourItem(getString(R.string.shopping_6),
                getString(R.string.shopping_6_description),
                getString(R.string.shopping_6_hours),
                true,
                R.drawable.credit_card
        ));

        // Construct a custom ArrayAdapter and give it tourItemsList ArrayList
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getActivity(), tourItemsList, R.color.fragment_background);

        // Create a ListView and set the custom ArrayAdapter as its adapter
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);

        return rootView;
    }

}
