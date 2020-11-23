package com.nishthapandya.miwok;

import android.widget.ImageView;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation , String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
        mAudioResourceId = audioResourceId;
    }

    //returns the default word translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //returns the miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //return the resource image ID
    public int getImageResourceID(){
        return mImageResourceID;
    }

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }

    //returns whether or not there is an image for this word
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
