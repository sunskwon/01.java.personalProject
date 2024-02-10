package com.ohgiraffers.horseRace;

public class Horse {

    private double preRace;
    private double lab = 0;

    HorseRace horse = new HorseRace();

    public void setPreRace(int i) {

        this.preRace = 18 + (33 - horse.getWinRate(i)) / 20;
    }

    public double getPreRace() {

        return preRace;
    }

    public void setLab(double lab) {

        this.lab += lab;
    }

    public double getLab() {

        return lab;
    }

    public void start() {

    }

    public void corner() {

    }

    public void longLine() {

    }

    public void shortLine() {

    }

    public void finish() {

    }
}
