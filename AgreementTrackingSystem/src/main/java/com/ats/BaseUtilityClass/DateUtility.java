package com.ats.BaseUtilityClass;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Date;
import java.util.Locale;

/**
 * Created by md.rahman on 2/26/2018.
 */
public class DateUtility {
    public static final String DD_MM_YYYY = "dd-MM-yyyy";
    public static final String DD_MMM_YYYY = "dd-MMM-yyyy";
    public static final String DDMMYY = "ddMMyy";
    public static final String YYYY_MM_DD = "yyyy-MM_dd";
    public static final String YYYY_MMM_DD = "yyyy-MMM_dd";
    public static final String DDMMYYYY = "dd/MM/yyyy";

    public static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();
    public static final TemporalAdjuster FIRST_DAY_OF_MONTH = TemporalAdjusters.firstDayOfMonth();
    public static final TemporalAdjuster FIRST_DAY_OF_YEAR = TemporalAdjusters.firstDayOfYear();
    public static final TemporalAdjuster FIRST_DAY_OF_NEXT_MONTH = TemporalAdjusters.firstDayOfNextMonth();
    public static final TemporalAdjuster FIRST_DAY_OF_NEXT_YEAR = TemporalAdjusters.firstDayOfNextYear();
    public static final TemporalAdjuster LAST_DAY_OF_MONTH = TemporalAdjusters.lastDayOfMonth();
    public static final TemporalAdjuster LAST_DAY_OF_YEAR = TemporalAdjusters.lastDayOfYear();

    private static Date simpleDate(LocalDate localDate) {
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(DEFAULT_ZONE);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

    private static Date simpleDateTime(LocalDateTime localDateTime) {
        ZonedDateTime zonedDateTime = localDateTime.atZone(DEFAULT_ZONE);
        Instant instant = zonedDateTime.toInstant();
        return Date.from(instant);
    }

    private static LocalDate localDate(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(DEFAULT_ZONE);
        return zonedDateTime.toLocalDate();
    }

    private static Date applicationServerDate() {
        LocalDate localDate = LocalDate.now();
        return simpleDate(localDate);
    }


    private static Date applicationServerDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return simpleDateTime(localDateTime);
    }


    private static String DayOfWeekFullLength(Date date) {
        LocalDate localDate = localDate(date);
        Month month = localDate.getMonth();
        return month.name();
    }


    private static String monthOfYearFullLength(Date date) {
        LocalDate localDate = localDate(date);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.name();
    }


    private static int weekOfMonth(Date date) {
        LocalDate localDate = localDate(date);
        TemporalField temporalField = WeekFields.of(Locale.getDefault()).weekOfMonth();
        return localDate.get(temporalField);

    }

    private static int weekOfYear(Date date) {
        LocalDate localDate = localDate(date);
        TemporalField temporalField = WeekFields.of(Locale.getDefault()).weekOfYear();
        return localDate.get(temporalField);

    }

    private static int monthOfYear(Date date) {
        LocalDate localDate = localDate(date);
        Month month = localDate.getMonth();
        return month.getValue();
    }

    private static String yearFullLength(Date date) {
        LocalDate localDate = localDate(date);
        Integer year = localDate.getYear();
        return year.toString();
    }

    private static String yearLength(Date date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy");
        LocalDate localDate = localDate(date);
        return localDate.format(formatter);
    }

    private static int noOfDaysOfMonth(Date date) {
        LocalDate localDate = localDate(date);
        DatePicker datePicker = new DatePicker();
        datePicker.setMonths(localDate.getMonthValue());
        Month localMonth = Month.of(datePicker.getMonths());
        return localMonth.minLength();
    }

    private static int noOfDaysOfYear(Date date) {
        LocalDate localDate = localDate(date);
        DatePicker datePicker = new DatePicker();
        datePicker.setYear(localDate.getMonthValue());
        Year localYear = Year.of(datePicker.getYear());
        return localYear.length();
    }
}
