package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    private static final String TAG = "Restaurants";

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list, container, false);


        //Create the ArrayList for the sections
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the sections to the ArrayList
        places.add(new Place(getString(R.string.karlstrauss_name), getString(R.string.karlstrauss_address),
                getString(R.string.karlstrauss_description), R.drawable.karlstrauss));
        places.add(new Place(getString(R.string.ignitebistro_name), getString(R.string.ignitebistro_address),
                getString(R.string.ignitebistro_description), R.drawable.ignitebistro));
        places.add(new Place(getString(R.string.pisco_name), getString(R.string.pisco_address),
                getString(R.string.pisco_description), R.drawable.pisco));
        places.add(new Place(getString(R.string.casadebandini_name), getString(R.string.casadebandini_address),
                getString(R.string.casadebandini_description), R.drawable.casadebandini));
        places.add(new Place(getString(R.string.nozomi_name), getString(R.string.nozomi_address),
                getString(R.string.nozomi_description), R.drawable.nozomi));
        places.add(new Place(getString(R.string.pizzaport_name), getString(R.string.pizzaport_address),
                getString(R.string.pizzaport_description), R.drawable.pizzaport));
        places.add(new Place(getString(R.string.bucadibeppo_name), getString(R.string.bucadibeppo_address),
                getString(R.string.bucadibeppo_description), R.drawable.buccadibeppo));
        places.add(new Place(getString(R.string.campfire_name), getString(R.string.campfire_address),
                getString(R.string.campfire_description), R.drawable.campfire));
        places.add(new Place(getString(R.string.canyons_name), getString(R.string.canyons_address),
                getString(R.string.canyons_description), R.drawable.canyons));
        places.add(new Place(getString(R.string.ciciottis_name), getString(R.string.ciciottis_address),
                getString(R.string.ciciottis_description), R.drawable.cicciottis));


        //Set the adapter for the sections
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) view.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return view;
    }
}
