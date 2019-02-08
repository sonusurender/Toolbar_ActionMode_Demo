package com.toolbar_actionmode_demo;

import java.io.Serializable;

/**
 * Created by SONU on 27/03/16.
 */
public class Item_Model implements Serializable {

    /*  Model class for List and Recycler Items  */
    private String title, subTitle;

    public Item_Model(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }
}
