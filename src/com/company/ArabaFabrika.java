package com.company;

import java.util.ArrayList;

/**
 * Created by brusk on 26.04.2016.
 */
public abstract class ArabaFabrika {

    private ArrayList<Araba> arabaListesi= new ArrayList<Araba>();

    public ArabaFabrika(){
        this.createAuto();
    }

    public abstract void createAuto();


    public ArrayList<Araba> getArabaListesi(){
        return arabaListesi;
    }
    public void setArabaListesi(ArrayList<Araba> arabaListesi){
        this.arabaListesi=arabaListesi;
    }
}
