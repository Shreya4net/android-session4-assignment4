package com.dce.puja.sortingdata;

/**
 * Created by Devendra on 4/11/2017.
 */

public class item {
    String AndroidListName;
    int AndroidListImage;

    public item(String AndroidName, int AndroidImage) {
        this.AndroidListImage = AndroidImage;
        this.AndroidListName = AndroidName;
    }

    public String getAndroidName() {
        return AndroidListName;
    }

    public int getAndroidImage() {
        return AndroidListImage;
    }
}
