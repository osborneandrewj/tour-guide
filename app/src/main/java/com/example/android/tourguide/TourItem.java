package com.example.android.tourguide;

/**
 * Created by osbor on 11/29/2016.
 */

public class TourItem {

    /** A name of the list item **/
    private String mTourItemTitle;
    /** A description of the list item **/
    private String mTourItemDescription;
    /** An address of the list item **/
    private String mTourItemAddress;


    /**
     * Construct a new TourItem object.
     *
     * @param aTitle for the item
     * @param aDescription for the item
     */
    public TourItem(String aTitle, String aDescription, String aAddress) {
        mTourItemTitle = aTitle;
        mTourItemDescription = aDescription;
        mTourItemAddress = aAddress;
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
     * Return the list item address
     *
     * @return list item address
     */
    public String getmTourItemAddress() {
        return mTourItemAddress;
    }

}
