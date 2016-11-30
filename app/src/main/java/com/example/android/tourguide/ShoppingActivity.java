package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create an ArrayList and populate it with TourItem custom objects
        ArrayList<TourItem> tourItemsList = new ArrayList<>();

        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));
        tourItemsList.add(new TourItem("Eiffel Tower",
                "Located in the heart of downtown",
                "Champ de Mars, 5 Avenue Anatole France, 75007 Paris"));

        // Construct a custom ArrayAdapter and give it tourItemsList ArrayList
        TourItemAdapter tourItemAdapter = new TourItemAdapter(getApplication(), tourItemsList);

        // Create a ListView and set the custom ArrayAdapter as its adapter
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(tourItemAdapter);

    }
}
