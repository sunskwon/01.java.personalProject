package com.ohgiraffers.horseRace;

public class LaneA extends Horse {

    private double preRaceA;

    public void setPreRaceA() {

        this.preRaceA = horse.getWinRate(0);
    }

    public double getPreRaceA() {

        return preRaceA;
    }
}
