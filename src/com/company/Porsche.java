package com.company;

/**
 * Created by brusk on 26.04.2016.
 */
public class Porsche extends ArabaFabrika {
    @Override
    public void createAuto() {
        getArabaListesi().add(new Panamera(1000));


    }
}
