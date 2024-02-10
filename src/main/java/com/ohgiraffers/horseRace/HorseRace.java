package com.ohgiraffers.horseRace;

public class HorseRace {

    private double[] setNum = new double[3];
    private static double[] winRate = new double[3];

    public void setNum() {

        this.setNum[0] = Math.random();
        this.setNum[1] = Math.random();
        this.setNum[2] = Math.random();

        setWinRate();
    }

    public void setWinRate() {

        winRate[0] = (double) ((int) (setNum[0] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;
        winRate[1] = (double) ((int) (setNum[1] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;
        winRate[2] = (double) ((int) (setNum[2] / (setNum[0] + setNum[1] + setNum[2]) * 10000)) / 100;


        System.out.println(winRate[0]);
        System.out.println(winRate[1]);
        System.out.println(winRate[2]);

    }

    public double getWinRate(int i) {

        return winRate[i];
    }

    public void beforeRace() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3초 후 경기가 시작됩니다.");
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2초 후 경기가 시작됩니다.");
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1초 후 경기가 시작됩니다.");
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
