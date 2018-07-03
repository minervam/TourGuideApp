package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter <Place> {
    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sections, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        //Get the object's properties
        String name = currentPlace.getName();
        String address = currentPlace.getAddress();
        String description = currentPlace.getDescription();
        int imageID = currentPlace.getImageResourceID();

        //Get the ImageView and set the name of the Object
        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        itemImageView.setImageResource(imageID);

        //Get the TextView and set the name of the Object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(name);

        //Get the TextView and set the name of the Object
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_item_address);
        addressTextView.setText(address);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent itemIntent = new Intent(context, PlaceDetailsActivity.class);

        //Put the properties of the Object to the intent
        itemIntent.putExtra(context.getString(R.string.name_var), name);
        itemIntent.putExtra(context.getString(R.string.address_var), address);
        itemIntent.putExtra(context.getString(R.string.desc_var), description);
        itemIntent.putExtra(context.getString(R.string.img_var), imageID);

        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        return listItemView;
    }
}
