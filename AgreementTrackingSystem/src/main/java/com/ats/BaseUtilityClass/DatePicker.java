package com.ats.BaseUtilityClass;

import java.io.Serializable;

/**
 * Created by md.rahman on 3/3/2018.
 */
public class DatePicker implements Serializable {
    private static final long serialVersionUID = -228406150161128955L;
    private int year;
    private int months;
    private int days;

    public DatePicker() {
    }

    public DatePicker(int year, int months, int days) {
        this.year = year;
        this.months = months;
        this.days = days;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
