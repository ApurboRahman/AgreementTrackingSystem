package com.programming;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.*;
import java.util.Date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
/**
 * Created by md.rahman on 11/26/2017.
 */


/**
 * Created by md.rahman on 11/23/2017.
 */
public class MonthAndYear {
    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    public static void main(String[] args) throws IOException {
        //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Integer days = Integer.valueOf(br.readLine());
        String date = "31-May-2017";
        Date dt = new Date(date);
        Integer month = 3;
        Date date1 = new Date("31-May-2017");
        System.out.println(plusMonths(dt, month));


        java.sql.Date nowDate2 = new java.sql.Date((new Date()).getTime());

        SimpleDateFormat formatNowDay = new SimpleDateFormat("dd");
        SimpleDateFormat formatNowMonth = new SimpleDateFormat("MM");
        SimpleDateFormat formatNowYear = new SimpleDateFormat("YYYY");

        String currentDay = formatNowDay.format(date1);
        String currentMonth = formatNowMonth.format(date1);
        String currentYear = formatNowYear.format(date1);

        int day = Integer.valueOf(currentDay);
        String currentYear2 = formatNowYear.format(nowDate2); // = '2006'

        switch (day) {
            case 1:
            case 21:
                formatNowYear = new SimpleDateFormat("dd MMMM, yyyy");
                currentYear2 = formatNowYear.format(nowDate2).toUpperCase();

                // currentYear2 = formatNowDay.format(nowDate2); // = '2006'
        }


    }

    public static Date plusMonths(Date date, long month) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(DEFAULT_ZONE);
        LocalDate localDate = zonedDateTime.toLocalDate();

        localDate = localDate.plusMonths(month);
        zonedDateTime = localDate.atStartOfDay(DEFAULT_ZONE);
        instant = zonedDateTime.toInstant();

        return Date.from(instant);
    }

    private static LocalDate localDate(Date date) {

        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(DEFAULT_ZONE);
        return zonedDateTime.toLocalDate();
    }

    private static Date simpleDate(LocalDate localDate) {
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(DEFAULT_ZONE);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

}


