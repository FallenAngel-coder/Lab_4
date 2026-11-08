package com.education.ztu;

public class Task3 {
    public static void main(String[] args) {
        int first = 4;
        int second = 36;

        StringBuilder addition = new StringBuilder();
        addition.append(first).append(" + ").append(second).append(" = ").append(first + second);

        StringBuilder subtraction = new StringBuilder();
        subtraction.append(first).append(" - ").append(second).append(" = ").append(first - second);

        StringBuilder multiplication = new StringBuilder();
        multiplication.append(first).append(" * ").append(second).append(" = ").append(first * second);

        StringBuilder[] expressions = {addition, subtraction, multiplication};
        for (StringBuilder expression : expressions) {
            System.out.println(expression);
            StringBuilder replacement = new StringBuilder(expression);

            int equalsIndex = expression.indexOf("=");
            expression.deleteCharAt(equalsIndex);
            expression.insert(equalsIndex, "рівно");
            System.out.println(expression);

            equalsIndex = replacement.indexOf("=");
            replacement.replace(equalsIndex, equalsIndex + 1, "рівно");
            System.out.println(replacement);

            System.out.println(expression.reverse());
            System.out.println("Довжина: " + expression.length());
            System.out.println("Capacity: " + expression.capacity());
        }
    }
}
