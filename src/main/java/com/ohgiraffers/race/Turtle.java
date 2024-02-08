package com.ohgiraffers.race;

public class Turtle extends Racer {

    @Override
    public void start(int num) {

        switch (num) {
            case 1:
                System.out.println("거북이가 달리기 시작합니다.");
                break;

            case 2:
                System.out.println("거북이가 달리기 시작합니다.");
                break;

            case 3:
                System.out.println("거북이가 (음흉한 미소와 함께) 달리기 시작합니다.");
                break;

            case 4:
                System.out.println("거북이는 토끼 등에서 쉬고있습니다.");
                break;
        }
    }

    @Override
    public void finish(int num) {

        switch (num) {
            case 1:
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("거북이가 (정말 오랜 시간이 걸렸지만) 결승선에 도착했습니다.");
                System.out.println();
                break;

            case 2:
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("거북이도 애썼지만 토끼보다 늦게 결승선에 도착했습니다.");
                break;

            case 3:
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("거북이가 먼저 결승선에 도착했습니다.");
                System.out.println();
                System.out.println("그런데 그렇게까지 해서 이기고 싶니?");
                break;

            case 4:
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("토끼 등에서 편하게 강 앞까지 온 거북이가 반대로 거북이를 등에 태우고 강을 건너기 시작합니다.");
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("결국 토끼와 거북이가 함께 결승선에 도착했습니다.");
                System.out.println();
                System.out.println("근데 이건 경주가 아니잖아...");
                break;
        }
    }

    public void encount() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("거북이가 멈춰선 토끼와 강물을 보고 신나게 노래를 부르며 헤엄쳐가기 시작합니다.");
                System.out.println();
    }
}
