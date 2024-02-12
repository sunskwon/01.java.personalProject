package com.ohgiraffers.horseRace;

public class HorseRace {

    private double[] setNum = new double[3];        // 승률 계산을 위한 임의의 수(배열)
    private static double[] winRate = new double[3];        // 승률(배열)
    // 임의의 수 생성
    public void setNum() {

        this.setNum[0] = Math.random();
        this.setNum[1] = Math.random();
        this.setNum[2] = Math.random();

        setWinRate();
    }
    // 임의의 수 기반 승률 계산
    public void setWinRate() {

        winRate[0] = setNum[0] / (setNum[0] + setNum[1] + setNum[2]);
        winRate[1] = setNum[1] / (setNum[0] + setNum[1] + setNum[2]);
        winRate[2] = setNum[2] / (setNum[0] + setNum[1] + setNum[2]);
    }

    public double getWinRate(int i) {

        return winRate[i];
    }
    // 경주 시작(별 의미 없음)
    public void startRace() {

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
