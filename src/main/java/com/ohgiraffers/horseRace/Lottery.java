package com.ohgiraffers.horseRace;

import java.util.Scanner;

public class Lottery {

    private boolean isParticipate;
    double[] allocation = new double[3];
    private char select;
    private int choose;
    private int bet;

    HorseRace h = new HorseRace();
    Horse ha = new LaneA();
    Horse hb = new LaneB();
    Horse hc = new LaneC();

    public void participate() {

        System.out.print("승부 예측에 참여 하시겠습니까? (y / n) ");
        Scanner sc = new Scanner(System.in);
        select = sc.nextLine().charAt(0);

        if (select == 'Y' || select == 'y') {

            this.isParticipate = true;
            double[] preRace = new double[3];

            for (int i = 0; i < preRace.length; i++) {

                preRace[i] = 18 + (0.33 - h.getWinRate(i)) / 20;
            }


            if (h.getWinRate(0) > h.getWinRate(1) && h.getWinRate(0) > h.getWinRate(2)) {

                allocation[0] = 1;
                allocation[1] = 1 + h.getWinRate(0) / h.getWinRate(1);
                allocation[2] = 1 + h.getWinRate(0) / h.getWinRate(2);
            } else if (h.getWinRate(1) > h.getWinRate(0) && h.getWinRate(1) > h.getWinRate(2)) {

                allocation[0] = 1 + h.getWinRate(1) / h.getWinRate(0);
                allocation[1] = 1;
                allocation[2] = 1 + h.getWinRate(1) / h.getWinRate(2);
            } else if (h.getWinRate(2) > h.getWinRate(0) && h.getWinRate(2) > h.getWinRate(1)) {

                allocation[0] = 1 + h.getWinRate(2) / h.getWinRate(0);
                allocation[1] = 1 + h.getWinRate(2) / h.getWinRate(1);
                allocation[2] = 1;
            }
            System.out.println();
            System.out.println("===== 숭률 예측 및 배당 현황 =====");
            System.out.println("  말      예상승률         배당률");
            System.out.println("1번 말      " + Math.round(h.getWinRate(0) * 100) + "%           " + Math.round(allocation[0] * 1000) / 1000.0);
            System.out.println("2번 말      " + Math.round(h.getWinRate(1) * 100) + "%           " + Math.round(allocation[1] * 1000) / 1000.0);
            System.out.println("3번 말      " + Math.round(h.getWinRate(2) * 100) + "%           " + Math.round(allocation[2] * 1000) / 1000.0);
            System.out.println("===============================");
            System.out.println();

            System.out.print("몇번 말에 베팅하시겠습니까? (1 - 3) ");
            choose = sc.nextInt();
            System.out.println();

            System.out.print("얼마를 베팅하시겠습니까? ");
            bet = sc.nextInt();
            System.out.println();

            System.out.println("베팅이 마감됐습니다. 행운을 빕니다!");
            System.out.println();
        }
    }

    public void result() {

        if (isParticipate) {

            if (choose == 1 && ha.getLab() > hb.getLab() && ha.getLab() > hc.getLab()) {

                System.out.println("축하합니다! 1번 말의 승리로 베팅 금액 " + bet + "원이 " + (bet * allocation[0]) + "원이 됐습니다.");
            } else if (choose == 2 && hb.getLab() > ha.getLab() && hb.getLab() > hc.getLab()) {

                System.out.println("축하합니다! 2번 말의 승리로 베팅 금액 " + bet + "원이 " + (bet * allocation[1]) + "원이 됐습니다.");
            } else if (choose == 3 && hc.getLab() > ha.getLab() && hc.getLab() > hb.getLab()) {

                System.out.println("축하합니다! 3번 말의 승리로 베팅 금액 " + bet + "원이 " + (bet * allocation[2]) + "원이 됐습니다.");
            } else {

                System.out.println("예측에 실패하셨습니다. 다음 기회에는 성공하시기를 바랍니다.");
            }
        }
    }
}
