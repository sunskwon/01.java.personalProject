package com.ohgiraffers.horseRace;

public class Horse {

    private double preRace;         // 승률 기반 결과값 예측
    private double lab = 0;         // 실시간 기록

    HorseRace horse = new HorseRace();
    // 승률 기반 결과 예측
    public void setPreRace(int i) {

        this.preRace = 18 + (0.33 - horse.getWinRate(i)) / 20;
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
    // 시작
    public void start() {

    }
    // 코너
    public void corner() {

    }
    // 직선(장거리)
    public void longLine() {

    }
    // 직선(단거리)
    public void shortLine() {

    }
    // 마지막
    public void finish() {

    }
}
