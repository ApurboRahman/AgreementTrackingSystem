package com.programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${Apurbo} on 4/5/2018.
 */
public class ParkingCharge {
    public static void main(String[] args) throws ParseException {
        ParkingCharge parkingCharge = new ParkingCharge();
        parkingCharge.soultion("10:00", "13:22");
        System.out.println(parkingCharge.soultion("", ""));
    }

    public static int getTotalMinutes(String time) {
        String[] t = time.split(":");
        return Integer.valueOf(t[0]) * 60 + Integer.valueOf(t[1]);
    }


    public int soultion(String E, String L) throws ParseException {
        if (E == null || L == null) {
            return 0;
        }
        if (E.isEmpty()) {
            return 0;
        }
        int entryTime = getTotalMinutes(E);
        int exitTime = getTotalMinutes(L);
        int totalStay = exitTime - entryTime;
        int minutes = totalStay % 60;
        int hours = ((totalStay - minutes) / 60) % 24;
        if (minutes > 0) {
            hours++;
        }
        int totalCharge = 2 + 3 + ((hours - 1) * 4);
        return totalCharge;
    }
}
