package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {
    private static final String TAG = "Shopping";

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList for the sections
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the sections to the ArrayList
        places.add(new Place(getString(R.string.premiumoutlets_name), getString(R.string.premiumoutlets_address),
                getString(R.string.premiumoutlets_description), R.drawable.premiumoutlets));
        places.add(new Place(getString(R.string.theforum_name), getString(R.string.theforum_address),
                getString(R.string.theforum_description), R.drawable.theforum));
        places.add(new Place(getString(R.string.theshoppes_name), getString(R.string.theshoppes_address),
                getString(R.string.theshoppes_description), R.drawable.theshoppes));
        places.add(new Place(getString(R.string.antiquemall_name), getString(R.string.antiquemall_address),
                getString(R.string.antiquemall_description), R.drawable.antiquemall));
        places.add(new Place(getString(R.string.villagefaire_name), getString(R.string.villagefaire_address),
                getString(R.string.villagefaire_description), R.drawable.villagefaire));
        places.add(new Place(getString(R.string.villageassoc_name), getString(R.string.villageassoc_address),
                getString(R.string.villageassoc_description), R.drawable.villageassoc));

        //Set the adapter for the sections
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) view.findViewById(R.id.place_list);

        listView.setAdapter(adapter);

        return view;
    }
}
