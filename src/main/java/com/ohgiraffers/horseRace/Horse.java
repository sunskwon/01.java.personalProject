package com.ohgiraffers.horseRace;

public class Horse {

    private double preRace;
    private double lab = 0;
    private double labOne = 0;
    private double labTwo = 0;
    private double labThree = 0;
    private double labFour = 0;
    private double labFive = 0;

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

    public void setLabOne(double labOne) {

        this.labOne = lab;
    }

    public void setLabTwo(double labTwo) {

        this.labTwo = lab;
    }

    public void setLabThree(double labThree) {

        this.labThree = lab;
    }

    public void setLabFour(double labFour) {

        this.labFour = lab;
    }

    public void setLabFive(double labFive) {

        this.labFive = lab;
    }


    public double getLabOne() {

        return labOne;
    }

    public double getLabTwo() {

        return labTwo;
    }

    public double getLabThree() {

        return labThree;
    }

    public double getLabFour() {

        return labFour;
    }

    public double getLabFive() {

        return labFive;
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
