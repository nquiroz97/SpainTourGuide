package com.example.spaintourguide;

public class Destination {
    private String mDestinationName;
    private String mDestinationInfo;
    private int mImageResourceId;

    public Destination(String destinationName, String destinationInfo, int imageResourceId) {
        mDestinationName = destinationName;
        mDestinationInfo = destinationInfo;
        mImageResourceId = imageResourceId;
    }


    public String getDestinationName() {
        return mDestinationName;

    }

    public String getDestinationInfo() {
        return mDestinationInfo;

    }


    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
