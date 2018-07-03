package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {
    private static final String TAG = "Attractions";

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList for the sections
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the sections to the ArrayList
        places.add(new Place(getString(R.string.legoland_name), getString(R.string.legoland_address),
                getString(R.string.legoland_description), R.drawable.legoland));
        places.add(new Place(getString(R.string.sealife_name), getString(R.string.sealife_address),
                getString(R.string.sealife_description), R.drawable.sealife));
        places.add(new Place(getString(R.string.flowerfields_name), getString(R.string.flowerfields_address),
                getString(R.string.flowerfields_description), R.drawable.flowerfields));
        places.add(new Place(getString(R.string.gia_name), getString(R.string.gia_address),
                getString(R.string.gia_description), R.drawable.gia));
        places.add(new Place(getString(R.string.musicmuseum_name), getString(R.string.musicmuseum_address),
                getString(R.string.musicmuseum_description), R.drawable.musicmuseum));
        places.add(new Place(getString(R.string.dragontavern_name), getString(R.string.dragontavern_address),
                getString(R.string.dragontavern_description), R.drawable.dragontavern));
        places.add(new Place(getString(R.string.leocarillo_name), getString(R.string.leocarillo_address),
                getString(R.string.leocarillo_description), R.drawable.leocarillo));

        //Set the adapter for the sections
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) view.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return view;
    }
}
