package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        LocalTime date =LocalTime.now();
        LocalTime Localtime = LocalTime.now();
        System.out.println(Localtime);
        for (int i = date.getMinute(); i <Localtime.getMinute() ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

















    }
}
