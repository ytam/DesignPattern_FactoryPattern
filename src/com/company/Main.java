package com.company;

public class Main {

    public static void main(String[] args) {

        ArabaFabrika bugatti = new Bugatti();
        ArabaFabrika porsche = new Porsche();

        for (Araba araba : bugatti.getArabaListesi()) {

            System.out.println(araba.getMarka() + " " + araba.getModel() + " " + araba.getBeygirGucu());
        }

        for (Araba araba : porsche.getArabaListesi()) {

            System.out.println(araba.getMarka() + " " + araba.getModel() + " " + araba.getBeygirGucu());

        }
    }
}
