package com.nishthapandya.miwok;

import android.widget.ImageView;

public class Word {

    private int mDefaultTranslation;
    private int mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId) {
        mDefaultTranslation = defaultTranslationId;
        mMiwokTranslation = miwokTranslationId;
        mAudioResourceId = audioResourceId;
    }

    public Word(int defaultTranslation, int miwokTranslation, int imageID, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
        mAudioResourceId = audioResourceId;
    }

    //returns the default word translation
    public int getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //returns the miwok translation
    public int getMiwokTranslation(){
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
