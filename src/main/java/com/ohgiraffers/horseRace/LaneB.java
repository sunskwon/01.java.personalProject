package com.ohgiraffers.horseRace;

public class LaneB extends Horse {

    private double preRaceB;

    public void setPreRaceB() {

        this.preRaceB = horse.getWinRate(1);
    }

    public double getPreRaceB() {

        return preRaceB;
    }
}
