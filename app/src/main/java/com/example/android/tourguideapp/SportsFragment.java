package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsFragment extends Fragment {
    private static final String TAG = "Sports";

    public SportsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.marathon_name), getString(R.string.marathon_address),
                getString(R.string.marathon_description), R.drawable.marathon));
        places.add(new Place(getString(R.string.carlsbadtriathlon_name), getString(R.string.carlsbadtriathlon_address),
                getString(R.string.carlsbadtriathlon_description), R.drawable.carlsbadtriathlon));
        places.add(new Place(getString(R.string.kiaclassic_name), getString(R.string.kiaclassic_address),
                getString(R.string.kiaclassic_description), R.drawable.kiaclassic));
        places.add(new Place(getString(R.string.grandprix_name), getString(R.string.grandprix_address),
                getString(R.string.grandprix_description), R.drawable.grandprix));
        places.add(new Place(getString(R.string.carlsbad5000_name), getString(R.string.carlsbad5000_address),
                getString(R.string.carlsbad5000_description), R.drawable.carlsbad5000));

        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) view.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return view;
    }
}

