package com.programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by md.rahman on 11/23/2017.
 */
public class Surcharge {
    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();

    public static void main(String[] args) throws IOException {
        //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Integer days = Integer.valueOf(br.readLine());
        String date = "01-May-2017";
        Date dt = new Date(date);
        Integer month = 2;

        System.out.println(plusMonths(dt, month));
        //System.out.println(getSurcharge(days));
    }

    public static BigDecimal getSurcharge(Integer days) {
        BigDecimal surcharge = BigDecimal.ZERO;
        BigDecimal paidAmount = BigDecimal.valueOf(5.00);
        BigDecimal vatAmount = BigDecimal.valueOf(0.85);
        if (days > 1 && days <= 30) {
            surcharge = BigDecimal.valueOf(0.02);
            surcharge = surcharge.multiply(paidAmount);
            paidAmount = paidAmount.add(surcharge);
            paidAmount = paidAmount.add(vatAmount);

        } else if (days > 30 && days <= 60) {
            surcharge = BigDecimal.valueOf(0.04);
            surcharge = surcharge.multiply(paidAmount);
            paidAmount = paidAmount.add(surcharge);
            paidAmount = paidAmount.add(vatAmount);
        } else {
            days = days - 60;

            Integer countMonth = (int) Math.ceil(days / 30.0);

            surcharge = BigDecimal.valueOf(countMonth * .06);
            surcharge = surcharge.multiply(paidAmount);
            paidAmount = paidAmount.add(surcharge);
            paidAmount = paidAmount.add(vatAmount);

            System.out.println(countMonth);
            System.out.println(surcharge);
        }

        return paidAmount;
    }

    public static Date plusMonths(Date date, long month) {

        LocalDate localDate = localDate(date);
        localDate = localDate.plusMonths(month);
        return simpleDate(localDate);
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
