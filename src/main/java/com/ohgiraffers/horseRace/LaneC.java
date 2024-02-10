package com.ohgiraffers.horseRace;

public class LaneC extends Horse {

    private double preRaceC;

    public void setPreRaceC() {

        this.preRaceC = horse.getWinRate(2);
    }

    public double getPreRaceC() {

        return preRaceC;
    }
}
