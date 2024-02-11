package com.ohgiraffers.horseRace.run;

import com.ohgiraffers.horseRace.*;

public class Application {

    public static void main(String[] args) {

        HorseRace h = new HorseRace();
        Horse ha = new LaneA();
        Horse hb = new LaneB();
        Horse hc = new LaneC();

        h.setNum();

        ha.setPreRace(0);
        hb.setPreRace(1);
        hc.setPreRace(2);

        System.out.println("===== 예비 경주 결과 (1바퀴) =====");
        System.out.println("1번 말 : " + Math.round(ha.getPreRace() * 1000) / 1000.0 + "초");
        System.out.println("2번 말 : " + Math.round(hb.getPreRace() * 1000) / 1000.0 + "초");
        System.out.println("3번 말 : " + Math.round(hc.getPreRace() * 1000) / 1000.0 + "초");
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
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

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
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

                if (hb.getLab() > hc.getLab()) {

                    hc.longLine();
                    hb.longLine();
                    ha.longLine();
                } else {

                    hb.longLine();
                    hc.longLine();
                    ha.longLine();
                }

            } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

                if (ha.getLab() > hc.getLab()) {

                    hc.longLine();
                    ha.longLine();
                    hb.longLine();
                } else {

                    ha.longLine();
                    hc.longLine();
                    hb.longLine();
                }
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

                if (ha.getLab() > hb.getLab()) {

                    hb.longLine();
                    ha.longLine();
                    hc.longLine();
                } else {

                    ha.longLine();
                    hb.longLine();
                    hc.longLine();
                }
            }
            System.out.println();

            try {
                Thread.sleep(6000);
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
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

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
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

                if (hb.getLab() > hc.getLab()) {

                    hc.shortLine();
                    hb.shortLine();
                    ha.shortLine();
                } else {

                    hb.shortLine();
                    hc.shortLine();
                    ha.shortLine();
                }

            } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

                if (ha.getLab() > hc.getLab()) {

                    hc.shortLine();
                    ha.shortLine();
                    hb.shortLine();
                } else {

                    ha.shortLine();
                    hc.shortLine();
                    hb.shortLine();
                }
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

                if (ha.getLab() > hb.getLab()) {

                    hb.shortLine();
                    ha.shortLine();
                    hc.shortLine();
                } else {

                    ha.shortLine();
                    hb.shortLine();
                    hc.shortLine();
                }
            }
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("===== 중간 결과 (" + (i + 1) + "바퀴) =====");
            if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

                if (hb.getLab() > hc.getLab()) {

                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                } else {

                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                }
            } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

                if (ha.getLab() > hc.getLab()) {

                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                } else {

                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                }
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

                if (ha.getLab() > hb.getLab()) {

                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                } else {

                    System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                    System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                }
            }
            System.out.println("===========================");
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

                if (hb.getLab() > hc.getLab()) {

                    hc.shortLine();
                    hb.shortLine();
                    ha.shortLine();
                } else {

                    hb.shortLine();
                    hc.shortLine();
                    ha.shortLine();
                }
            } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

                if (ha.getLab() > hc.getLab()) {

                    hc.shortLine();
                    ha.shortLine();
                    hb.shortLine();
                } else {

                    ha.shortLine();
                    hc.shortLine();
                    hb.shortLine();
                }
            } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

                if (ha.getLab() > hb.getLab()) {

                    hb.shortLine();
                    ha.shortLine();
                    hc.shortLine();
                } else {

                    ha.shortLine();
                    hb.shortLine();
                    hc.shortLine();
                }
            }
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
        } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

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
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

            if (hb.getLab() > hc.getLab()) {

                hc.longLine();
                hb.longLine();
                ha.longLine();
            } else {

                hb.longLine();
                hc.longLine();
                ha.longLine();
            }
        } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

            if (ha.getLab() > hc.getLab()) {

                hc.longLine();
                ha.longLine();
                hb.longLine();
            } else {

                ha.longLine();
                hc.longLine();
                hb.longLine();
            }
        } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

            if (ha.getLab() > hb.getLab()) {

                hb.longLine();
                ha.longLine();
                hc.longLine();
            } else {

                ha.longLine();
                hb.longLine();
                hc.longLine();
            }
        }
        System.out.println();

        try {
            Thread.sleep(6000);
        } catch (
                InterruptedException e) {
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
        } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

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
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

            if (hb.getLab() > hc.getLab()) {

                hc.finish();
                hb.finish();
                ha.finish();
            } else {

                hb.finish();
                hc.finish();
                ha.finish();
            }
        } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

            if (ha.getLab() > hc.getLab()) {

                hc.finish();
                ha.finish();
                hb.finish();
            } else {

                ha.finish();
                hc.finish();
                hb.finish();
            }
        } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

            if (ha.getLab() > hb.getLab()) {

                hb.finish();
                ha.finish();
                hc.finish();
            } else {

                ha.finish();
                hb.finish();
                hc.finish();
            }
        }
        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("========= 최종 결과 =========");
        if (ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

            if (hb.getLab() > hc.getLab()) {

                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            } else {

                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            }
        } else if (hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

            if (ha.getLab() > hc.getLab()) {

                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            } else {

                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            }
        } else if (hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

            if (ha.getLab() > hb.getLab()) {

                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            } else {

                System.out.println("1번 말 : " + ((int) (ha.getLab() / 60)) + "분 " + (Math.round((ha.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("2번 말 : " + ((int) (hb.getLab() / 60)) + "분 " + (Math.round((hb.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
                System.out.println("3번 말 : " + ((int) (hc.getLab() / 60)) + "분 " + (Math.round((hc.getLab() - ((int) ha.getLab() / 60) * 60) * 1000) / 1000.0) + "초");
            }
        }
        System.out.println("============================");
    }
}
