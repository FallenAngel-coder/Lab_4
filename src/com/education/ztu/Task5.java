package com.education.ztu;

import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {
        Task4.printReceipt(Locale.forLanguageTag("uk-UA"));
        Task4.printReceipt(Locale.forLanguageTag("en-US"));
        Task4.printReceipt(Locale.forLanguageTag("pl-PL"));
    }
}
