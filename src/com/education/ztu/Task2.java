package com.education.ztu;

public class Task2 {
    public static void stringMethods(String text) {
        if (!text.isEmpty()) {
            System.out.println(text.charAt(text.length() - 1));
        }
        System.out.println(text.endsWith("!!!"));
        System.out.println(text.startsWith("I learn "));
        System.out.println(text.contains("Java"));
        int javaIndex = text.indexOf("Java");
        System.out.println(javaIndex);
        System.out.println(text.replace('a', 'o'));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        if (javaIndex != -1) {
            System.out.println(text.substring(javaIndex, javaIndex + 4));
        }
    }

    public static void main(String[] args) {
        stringMethods("I learn Java!!!");
    }
}
