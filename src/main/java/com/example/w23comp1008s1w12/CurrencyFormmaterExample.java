package com.example.w23comp1008s1w12;

import javafx.util.converter.CurrencyStringConverter;

import java.util.Locale;

public class CurrencyFormmaterExample {
    public static void main(String[] args) {
        CurrencyStringConverter csc = new CurrencyStringConverter(Locale.CANADA);
        double oneMillion = 1000000.98234214;
        System.out.printf("formmated for currency: %s%n",csc.toString(oneMillion));
    }
}
