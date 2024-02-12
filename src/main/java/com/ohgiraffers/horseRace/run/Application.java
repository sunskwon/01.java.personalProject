package com.ohgiraffers.horseRace.run;

import com.ohgiraffers.horseRace.*;

public class Application {

    public static void main(String[] args) {

        /* 경마
        1. 말은 출발, 코너링, 직선(장거리 & 단거리), 도착을 할 수 있다.
            1-1. 각 말마다 성공/실패 확률이 존재하며 그 확률은 가중치에 따라 달라진다.
        2. 경마(본부)는 각 말들의 승리 확률을 갖고있으며, 말들은 그 값을 기반으로 사전 경기 기록을 갖는다.
        3. 마권은 경마의 승리 확률에 따라 배당율을 계산하며, 마권의 구입 및 결과를 처리한다.
        4. 세마리의 말은 동시에 출발한다.
        5. 경주는 1바퀴에 직선(단거리) / 코너 / 직선(장거리) / 코너 / 직선(단거리) 코스로 이루어진다.
            5-1. 각 코스마다 성공/실패 확률이 존재하며, 성공시 기록이 단축 / 실패시 기록이 증가 된다.
            5-2. 1바퀴마다 중간 결과가 공지된다.
            5-3. 각 코스 입장시 이전 코스까지의 기록에 따라 안내(출력)되는 순서가 달라진다.
        6. 마권은 경주 시작 전 구매 여부를 통해 결정할 수 있으며, 경마가 끝난 후 기록에 따라 결과가 달라진다.
            6-1. 마권 구매시 각 말의 승률과 배당이 공개된다.
            6-2. 마권 구매시 승리할것으로 예측되는 말과 베팅 금액을 정할 수 있다.
            6-3. 마권을 구매한 경우 경마가 끝나면 기록에 따라 다른 결과가 안내(출력)된다.

        말이 수신할 수 있는 메세지
        1. 출발
        2. 코너
        3. 직선
            3-1. 장거리
            3-2. 단거리
        4. 도착

        경마(본부)가 수신할 수 있는 메세지
        1. 말들의 승률 계산
        2. 경마의 시작

        마권이 수신할 수 있는 메세지
        1. 마권 구매
        2. 마권 결과
        */
        // 호출자 생성
        HorseRace h = new HorseRace();
        Horse ha = new LaneA();
        Horse hb = new LaneB();
        Horse hc = new LaneC();
        Lottery l = new Lottery();
        // 승률 계산을 위한 임의의 수 생성
        h.setNum();
        // 승률 기반의 예측 성적값 입력
        ha.setPreRace(0);
        hb.setPreRace(1);
        hc.setPreRace(2);
        // 예측 성적값 출력
        System.out.println("===== 사전 경주 결과 (1바퀴) =====");
        System.out.println("1번 말 : " + Math.round(ha.getPreRace() * 1000) / 1000.0 + "초");
        System.out.println("2번 말 : " + Math.round(hb.getPreRace() * 1000) / 1000.0 + "초");
        System.out.println("3번 말 : " + Math.round(hc.getPreRace() * 1000) / 1000.0 + "초");
        System.out.println("===============================");
        System.out.println();
        // 마권 구매 참여 여부
        l.participate();
        // 경마 시작
        h.startRace();
        // 출발
        ha.start();
        hb.start();
        hc.start();
        System.out.println();
        // 코너 / 직선(장거리) / 코너 / 직선(단거리) / 중간결과 출력 / 직선(단거리) 반복 실행
        int i = 0;
        while (i < 4) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 이전까지의 기록 기반 실행(출력) 순서 변화
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
        System.out.println();
        // 마권 구매시 결과 출력
        l.result();
    }
}
