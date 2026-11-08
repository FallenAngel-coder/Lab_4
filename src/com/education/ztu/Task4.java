package com.education.ztu;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Formatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Task4 {
    public static void printReceipt(Locale locale) {
        ResourceBundle data = ResourceBundle.getBundle("data", locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        LocalDateTime purchaseTime = LocalDateTime.of(2019, 3, 28, 13, 25, 12);
        double[] prices = {1500.78, 1000.56, 500.78, 800.00, 1200.50,
                450.00, 950.25, 2100.00, 750.30, 3000.00};
        double total = 0;
        String line = "=================================================================";
        Formatter formatter = new Formatter(locale);

        formatter.format("%s: %td.%<tm.%<tY %<tT%n", data.getString("purchaseDate"), purchaseTime);
        formatter.format("%s%n", line);
        formatter.format("%-4s %-20s %-22s %15s%n", data.getString("number"),
                data.getString("product"), data.getString("category"), data.getString("price"));
        formatter.format("%s%n", line);

        for (int i = 0; i < prices.length; i++) {
            formatter.format("%-4s %-20s %-22s %15s%n", (i + 1) + ".",
                    data.getString("product" + (i + 1)), data.getString("category" + (i + 1)),
                    currencyFormat.format(prices[i]));
            total += prices[i];
        }

        formatter.format("%s%n", line);
        formatter.format("%s: %s%n", data.getString("total"), currencyFormat.format(total));
        System.out.print(formatter);
        formatter.close();
    }

    public static void main(String[] args) {
        printReceipt(Locale.forLanguageTag("uk-UA"));
    }
}
