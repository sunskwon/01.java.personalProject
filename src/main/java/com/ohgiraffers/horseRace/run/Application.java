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

        la.setPreRaceA();
        lb.setPreRaceB();
        lc.setPreRaceC();

        System.out.println(la.getPreRaceA());
        System.out.println(lb.getPreRaceB());
        System.out.println(lc.getPreRaceC());
    }
}
