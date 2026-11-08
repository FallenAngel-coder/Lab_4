package com.education.ztu;

import java.time.LocalDateTime;

public class Task6 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2026, 11, 8, 10, 53, 5);
        System.out.println("Початок лабораторної: " + start);
        System.out.println("День тижня: " + start.getDayOfWeek());
        System.out.println("День у році: " + start.getDayOfYear());
        System.out.println("Місяць: " + start.getMonth());
        System.out.println("Рік: " + start.getYear());
        System.out.println("Години: " + start.getHour());
        System.out.println("Хвилини: " + start.getMinute());
        System.out.println("Секунди: " + start.getSecond());
        System.out.println("Високосний рік: " + start.toLocalDate().isLeapYear());

        LocalDateTime current = LocalDateTime.now();
        System.out.println("Поточний час: " + current);
        System.out.println("Поточний час після початку: " + current.isAfter(start));
        System.out.println("Поточний час перед початком: " + current.isBefore(start));

        LocalDateTime changed = start.plusDays(1).withHour(12).withMinute(30).withSecond(0);
        System.out.println("Змінена дата та час: " + changed);
    }
}
