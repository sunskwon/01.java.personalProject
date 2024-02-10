package com.ohgiraffers.horseRace.run;

import com.ohgiraffers.horseRace.*;

public class Application {

    public static void main(String[] args) {

        HorseRace h = new HorseRace();
        Horse ha = new LaneA();
        Horse hb = new LaneB();
        Horse hc = new LaneC();
        LaneA la = new LaneA();
        LaneB lb = new LaneB();
        LaneC lc = new LaneC();

        h.setNum();

        ha.setPreRace(0);
        hb.setPreRace(1);
        hc.setPreRace(2);

        System.out.println("===== 예비 경주 결과 (1바퀴) =====");
        System.out.println("1번 말 : " + ha.getPreRace() + "초");
        System.out.println("2번 말 : " + hb.getPreRace() + "초");
        System.out.println("3번 말 : " + hc.getPreRace() + "초");
        System.out.println("===============================");
        System.out.println();

        h.beforeRace();

        ha.start();
        hb.start();
        hc.start();
        System.out.println();

        int i = 0;
        while (i < 4) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ha.corner();
            hb.corner();
            hc.corner();
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ha.longLine();
            hb.longLine();
            hc.longLine();
            System.out.println();

            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ha.corner();
            hb.corner();
            hc.corner();
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ha.shortLine();
            hb.shortLine();
            hc.shortLine();
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("===== 중간 결과 (" + (i + 1) + "바퀴) =====");
            System.out.println("1번 말 : " + ha.getLab() + "초");
            System.out.println("2번 말 : " + hb.getLab() + "초");
            System.out.println("3번 말 : " + hc.getLab() + "초");
            System.out.println("===========================");
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ha.shortLine();
            hb.shortLine();
            hc.shortLine();
            System.out.println();

            i++;
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

            if (hb.getLab() > hc.getLab()) {

                hc.corner();
                hb.corner();
                ha.corner();

            } else {

                hb.corner();
                hc.corner();
                ha.corner();
            }

        } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

            if (ha.getLab() > hc.getLab()) {

                hc.corner();
                ha.corner();
                hb.corner();
            } else {

                ha.corner();
                hc.corner();
                hb.corner();
            }
        } else {

            if (ha.getLab() > hb.getLab()) {

                hb.corner();
                ha.corner();
                hc.corner();
            } else {

                ha.corner();
                hb.corner();
                hc.corner();
            }
        }

        System.out.println(ha.getLab());
        System.out.println(hb.getLab());
        System.out.println(hc.getLab());
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        ha.longLine();
        hb.longLine();
        hc.longLine();
        System.out.println();

        try {
            Thread.sleep(6000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        ha.corner();
        hb.corner();
        hc.corner();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        ha.finish();
        hb.finish();
        hc.finish();
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("========= 최종 결과 =========");
        System.out.println("1번 말 : " + ha.getLab() + "초");
        System.out.println("2번 말 : " + hb.getLab() + "초");
        System.out.println("3번 말 : " + hc.getLab() + "초");
        System.out.println("===========================");
        System.out.println();
    }
}
