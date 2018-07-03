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

public class BeachesFragment extends Fragment {
    private static final String TAG = "Beaches";

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList for the sections
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the sections to the ArrayList
        places.add(new Place(getString(R.string.ponto_name), getString(R.string.ponto_address),
                getString(R.string.ponto_description), R.drawable.ponto));
        places.add(new Place(getString(R.string.tamarack_name), getString(R.string.tamarack_address),
                getString(R.string.tamarak_description), R.drawable.tamarack));
        places.add(new Place(getString(R.string.statebeach_name), getString(R.string.statebeach_address),
                getString(R.string.statebeach_description), R.drawable.statebeach));
        places.add(new Place(getString(R.string.northbeach_name), getString(R.string.northbeach_address),
                getString(R.string.northbeach_description), R.drawable.northbeach));
        places.add(new Place(getString(R.string.terramar_name), getString(R.string.terramar_address),
                getString(R.string.terramar_description), R.drawable.terramar));


        //Set the adapter for the sections
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) view.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return view;
    }
}
