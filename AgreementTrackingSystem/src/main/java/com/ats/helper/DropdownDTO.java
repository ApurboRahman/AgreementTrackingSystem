package com.ats.helper;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Created by md.rahman on 11/18/2017.
 */
public class DropdownDTO {
    public static Comparator<DropdownDTO> sort = new Comparator<DropdownDTO>() {
        @Override
        public int compare(DropdownDTO o1, DropdownDTO o2) {
            return o1.getText().compareTo(o2.getText());
        }
    };


    private String text;
    private String value;
    private Short valueShort;
    private Integer valueInteger;
    private Character valueChar;
    private BigDecimal valueBigDecimal;


    public DropdownDTO() {
    }

    public DropdownDTO(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public DropdownDTO(String text, Short valueShort) {
        this.text = text;
        this.valueShort = valueShort;
    }

    public DropdownDTO(String text, Integer valueInteger) {
        this.text = text;
        this.valueInteger = valueInteger;
    }

    public DropdownDTO(String text, Character valueChar) {
        this.text = text;
        this.valueChar = valueChar;
    }

    public DropdownDTO(String text, BigDecimal valueBigDecimal) {
        this.text = text;
        this.valueBigDecimal = valueBigDecimal;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Short getValueShort() {
        return valueShort;
    }

    public void setValueShort(Short valueShort) {
        this.valueShort = valueShort;
    }

    public Integer getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(Integer valueInteger) {
        this.valueInteger = valueInteger;
    }

    public Character getValueChar() {
        return valueChar;
    }

    public void setValueChar(Character valueChar) {
        this.valueChar = valueChar;
    }

    public BigDecimal getValueBigDecimal() {
        return valueBigDecimal;
    }

    public void setValueBigDecimal(BigDecimal valueBigDecimal) {
        this.valueBigDecimal = valueBigDecimal;
    }
}
