package com.company;

/**
 * Created by brusk on 26.04.2016.
 */
public abstract class Araba {

    private String marka;
    private String model;
    private int beygirGucu=0;

    public Araba(String marka, int beygirGucu, String model) {
        setMarka(marka);
        setBeygirGucu(beygirGucu);
        setModel(model);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }
}
