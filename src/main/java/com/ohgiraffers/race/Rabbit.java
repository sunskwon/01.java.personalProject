package com.ohgiraffers.race;

public class Rabbit extends Racer {

    @Override
    public void start(int num) {

        switch (num) {
            case 1:
                System.out.println("토끼가 달리기 시작합니다.");
                System.out.println();
                break;

            case 2:
                System.out.println("토끼가 (굳은 결심과 함께) 달리기 시작합니다.");
                System.out.println();
                break;

            case 3:
                System.out.println("토끼가 (다시 한 번 굳은 결심과 함께) 달리기 시작합니다.");
                System.out.println();
                break;

            case 4:
                System.out.println("토끼가 달리기 시작합니다.");
                System.out.println();
                System.out.println("근데 왜 거북이가 토끼 등에 있지?");
                System.out.println();
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
                System.out.println("토끼는 어디에 있을까요?");
                break;

            case 2:
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("토끼가 결승선에 도착했습니다.");
                System.out.println();
                break;

            case 3:
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("토끼가 경로를 가로질러 흐르는 강물을 보고 욕을 하기 시작했습니다.");
                System.out.println("!@#$%^&*!!!!!!");
                System.out.println();
                break;

            case 4:
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("토끼가 강물 앞까지 도착했습니다.");
                System.out.println();
                break;
        }
    }

    public void sleep() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("토끼가 달리기를 멈추고 나무 밑에서 잠들었습니다.");
        System.out.println();
    }
}
