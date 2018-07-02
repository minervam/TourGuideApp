package com.example.android.tourguideapp;

import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class Place {
    //The name of the place
    private String mPlaceName;

    //The address of the place
    private String mPlaceAddress;

    //The description of the place
    private String mPlaceDescription;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID;

    //Public constructor of the Place object with no audio resource
    public Place (String name, String address, String description, int imageResourceID) {
        mPlaceName = name;
        mPlaceAddress = address;
        mPlaceImageResourceID = imageResourceID;
        mPlaceDescription = description;
    }

    //Get the name of the place
    public String getName(){
        return mPlaceName;
    }

    //Get the address of the place
    public String getAddress(){
        return mPlaceAddress;
    }

    //Get the description of the place
    public String getDescription(){
        return mPlaceDescription;
    }

    //Get the image resource ID of the place
    public int getImageResourceID(){
        return mPlaceImageResourceID;
    }

}
