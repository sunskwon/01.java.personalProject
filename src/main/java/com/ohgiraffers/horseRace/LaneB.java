package com.ohgiraffers.horseRace;

public class LaneB extends Horse {

    @Override
    public void start() {

        double dice = Math.random();
        double temp;

        if (dice > 0.65) {

            System.out.println("2번 말이 좋은 출발로 경주를 시작합니다.");
            temp = (getPreRace() / 6 - (dice - 0.65) * 2);
            setLab(temp);
        } else {

            System.out.println("2번 말이 출발합니다.");
            setLab(getPreRace() / 6);
        }
    }

    @Override
    public void corner() {

        double dice = Math.random();
        double temp;

        if (dice > 0.75) {

            System.out.println("2번 말이 좋은 코너링을 보여줍니다.");
            temp = (getPreRace() / 6 - (dice - 0.75) * 2);
            setLab(temp);
        } else if (dice < 0.30) {

            System.out.println("2번 말이 코너링 실수로 실속합니다.");
            temp = (getPreRace() / 6 + (0.3 - dice) * 2);
            setLab(temp);
        } else {

            System.out.println("2번 말이 코너를 빠져나갑니다.");
            temp = (getPreRace() / 6);
            setLab(temp);
        }
    }

    @Override
    public void longLine() {

        double dice = Math.random();
        double temp;

        if (dice > 0.65) {

            System.out.println("2번 말이 직선코스에서 가속합니다.");
            temp = (getPreRace() / 3 - (dice - 0.65) * 6);
            setLab(temp);
        } else {

            System.out.println("2번 말이 직선코스를 질주합니다.");
            temp = (getPreRace() / 3);
            setLab(temp);
        }
    }

    @Override
    public void shortLine() {

        double dice = Math.random();
        double temp;

        if (dice > 0.65) {

            System.out.println("2번 말이 직선코스에서 가속합니다.");
            temp = (getPreRace() / 6 - (dice - 0.65) * 2);
            setLab(temp);
        } else {

            System.out.println("2번 말이 직선코스를 질주합니다.");
            temp = (getPreRace() / 6);
            setLab(temp);
        }
    }

    @Override
    public void finish() {

        double dice = Math.random();
        double temp;

        if (dice > 0.65) {

            System.out.println("2번 말이 마지막으로 힘을냅니다.");
            temp = (getPreRace() / 6 - (dice - 0.65) * 3);
            setLab(temp);
        } else {

            System.out.println("2번 말이 결승선을 향해 달립니다.");
            temp = (getPreRace() / 6);
            setLab(temp);
        }
    }
}
