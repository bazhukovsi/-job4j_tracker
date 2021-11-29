package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
    return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(20));
        System.out.println(minus(20));
        System.out.println(calculator.multiply(20));
        System.out.println(calculator.divide(20));
        System.out.println("--------------------------");
        System.out.println(calculator.sumAllOperation(20));
    }
}
