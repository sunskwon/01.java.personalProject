package com.ohgiraffers.horseRace;

public class HorseRace {

    private double[] setNum = new double[3];
    private static double[] winRate = new double[3];

    public void setNum() {

        this.setNum[0] = Math.random();
        this.setNum[1] = Math.random();
        this.setNum[2] = Math.random();

        System.out.println(setNum[0]);
        System.out.println(setNum[1]);
        System.out.println(setNum[2]);

        setWinRate();
    }

    public void setWinRate() {

        this.winRate[0] = (double) ((int) (setNum[0] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;
        this.winRate[1] = (double) ((int) (setNum[1] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;
        this.winRate[2] = (double) ((int) (setNum[2] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;

        System.out.println(winRate[0]);
        System.out.println(winRate[1]);
        System.out.println(winRate[2]);
    }

    public double getWinRate(int i) {

        return winRate[i];
    }
}
