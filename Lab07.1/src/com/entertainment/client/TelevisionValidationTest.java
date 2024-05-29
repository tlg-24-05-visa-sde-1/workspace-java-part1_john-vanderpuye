package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.setVolume(1); // should "stick," i.e., the value should be stored
        System.out.println(tv1.getVolume()); // should show a 1 for snoozeInterval
        tv1.setVolume(100); // should "stick"
        System.out.println(tv1.getVolume());
        tv1.setVolume(-1);
        System.out.println(tv1.getVolume());
        tv1.setVolume(101);
        System.out.println(tv1.getVolume());
        Television tv = new Television("Samsung", -1);
        System.out.println(tv);
        tv1.setBrand("Samsung");
        System.out.println(tv1);
        tv1.setBrand("LG");
        System.out.println(tv1);
        tv1.setBrand("Sony");
        System.out.println(tv1);
        tv1.setBrand("Toshiba");
        System.out.println(tv1);
        tv1.setBrand("Philips");
        System.out.println(tv1);
        tv1.setDisplay(DisplayType.CRT);
        System.out.println(tv1);
        Television tv2 = new Television("Sony", 35);
        System.out.println(tv2);

    }
}