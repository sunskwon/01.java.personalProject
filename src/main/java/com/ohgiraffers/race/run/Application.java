package com.ohgiraffers.race.run;

import com.ohgiraffers.race.Rabbit;
import com.ohgiraffers.race.Racer;
import com.ohgiraffers.race.Turtle;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* read me
        토끼와 거북이가 경주하는 이야기
        1. 토끼는 출발, 도착과 잠들기를 할 수 있다.
        2. 거북이는 출발과 도착만 할 수 있다.
        3. 토끼와 거북이는 동일한 abstract class (Racer)로 부터 상속 받는다.
        4. abstract class는 시작(start)과 끝(finish)에 관한 출력 반환문(abstract method)을 갖는다.
        5. abstract method는 정수형 변수를 매개변수로 한다.
        6. 매개변수에 따라 토끼와 거북이의 경주 회차가 달라진다(switch문 이용).
           (하지만 이미 모두가 이 이야기의 내용과 결말을 알고있다...)

        토끼가 수신할 수 있는 메세지
        1. 출발
        2. 도착
        3. 잠들기

        거북이가 수신할 수 있는 메세지
        1. 출발
        2. 도착
         */

        Racer r1 = new Rabbit();
        Racer r2 = new Turtle();
        Rabbit rab = new Rabbit();

        Scanner sc = new Scanner(System.in);

        System.out.println("===== 토끼와 거북이의 경주 =====");
        System.out.print("보고싶은 회차의 경기를 선택하세요 (1 - 4) : ");
        int num = sc.nextInt();
        System.out.println();

        if (num >= 1 && num <= 4) {

            System.out.println(num + "회차 경기를 시작합니다.");
            System.out.println();
        }

        switch (num) {
            case 1:
                r2.start(num);
                r1.start(num);

                rab.sleep();

                r2.finish(num);
                r1.finish(num);
                break;

            case 2:
                r2.start(num);
                r1.start(num);

                r1.finish(num);
                r2.finish(num);
                break;

            case 3:
                r2.start(num);
                r1.start(num);

                r1.finish(num);
                r2.finish(num);
                break;

            case 4:
                r2.start(num);
                r1.start(num);

                r1.finish(num);
                r2.finish(num);
                break;

            default :
                System.out.println("1에서 4까지 정수 중 하나만 입력해주세요");
                break;
        }
    }
}
