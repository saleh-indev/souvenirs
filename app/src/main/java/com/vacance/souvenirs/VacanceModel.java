package com.vacance.souvenirs;

import java.util.ArrayList;

public class VacanceModel {
    private String mTitle;
    private ArrayList<Lieu> lieux;
    public VacanceModel(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public ArrayList<Lieu> getLieux() {
        return lieux;
    }

    public void setLieux(ArrayList<Lieu> lieux) {
        this.lieux = lieux;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
