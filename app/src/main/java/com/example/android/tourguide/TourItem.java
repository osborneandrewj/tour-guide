package com.example.android.tourguide;

/**
 * Created by osborne on 11/29/2016.
 */

public class TourItem {

    /**
     * A name of the list item
     **/
    private String mTourItemTitle;
    /**
     * A description of the list item
     **/
    private String mTourItemDescription;
    /**
     * The listed hours of the item
     **/
    private String mTourItemHours;
    /**
     * boolean to store the open/closed status of item
     **/
    private boolean mIsOpen;
    /**
     * Stores the icon image resource ID of the item
     **/
    private int mImageResourceId = NO_IMAGE;
    /**
     * Used to determine if list item has an image
     **/
    private static final int NO_IMAGE = -1;
    /**
     * boolean to set the Hotel status of an item
     **/
    private boolean mIsHotel = NOT_HOTEL;
    /**
     * used to determine if item is a hotel
     **/
    private static final boolean NOT_HOTEL = false;
    /**
     * Stores the price of a hotel item
     **/
    private int mHotelPrice;

    /**
     * Construct a new TourItem object
     *
     * @param aTitle       for the item
     * @param aDescription for the item
     * @param aHours       that item is open
     * @param isOpen       true for open, false for closed
     * @param aImage       is the image resource ID
     * @param isHotel      boolean is this object a hotel?
     * @param hotelPrice   price per night of hotel
     */
    public TourItem(String aTitle, String aDescription, String aHours, boolean isOpen, int aImage,
                    boolean isHotel, int hotelPrice) {
        mTourItemTitle = aTitle;
        mTourItemDescription = aDescription;
        mTourItemHours = aHours;
        mIsOpen = isOpen;
        mImageResourceId = aImage;
        mIsHotel = isHotel;
        mHotelPrice = hotelPrice;
    }

    /**
     * Construct a new TourItem object
     *
     * @param aTitle       for the item
     * @param aDescription for the item
     * @param aHours       that item is open
     * @param isOpen       true for open, false for closed
     * @param aImage       is the image resource ID
     */
    public TourItem(String aTitle, String aDescription, String aHours, boolean isOpen, int aImage) {
        mTourItemTitle = aTitle;
        mTourItemDescription = aDescription;
        mTourItemHours = aHours;
        mIsOpen = isOpen;
        mImageResourceId = aImage;
    }

    /**
     * Return the list item title.
     *
     * @return list item title
     */
    public String getTourItemTitle() {
        return mTourItemTitle;
    }

    /**
     * Return the list item description.
     *
     * @return list item description
     */
    public String getTourItemDescription() {
        return mTourItemDescription;
    }

    /**
     * Return the list item's hours of operation
     *
     * @return list item hours
     */
    public String getmTourItemHours() {
        return mTourItemHours;
    }

    /**
     * Return the list item's open status
     *
     * @return true if item is open for business
     */
    public boolean getIsOpen() {
        return mIsOpen;
    }

    /**
     * Method to get the image resource ID
     *
     * @return the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Checks whether an image has been provided
     *
     * @return true if an image has been provided
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    /**
     * Checks whether the item is a hotel
     *
     * @return true if item is a hotel
     */
    public boolean isHotel() {
        return mIsHotel != NOT_HOTEL;
    }

    /**
     * Method to get the hotel's price
     *
     * @return the hotel's price in String format
     */
    public String getHotelPrice() {
        return Integer.toString(mHotelPrice);
    }
}
