package src.src.ru.itmo.java.basics.lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Operation + Enter two numbers int : ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        sum(num1, num2);
        System.out.println("Operation + Enter two numbers double : ");
        double d1 = reader.nextDouble();
        double d2 = reader.nextDouble();
        sum(d1, d2);
        System.out.println("Operation + Enter two numbers long : ");
        long l1 = reader.nextLong();
        long l2 = reader.nextLong();
        sum(l1, l2);
        System.out.println("Operation / Enter two numbers double : ");
        double c1 = reader.nextDouble();
        double c2 = reader.nextDouble();
        division(c1, c2);
        System.out.println("Operation / Enter two numbers int : ");
        int i1 = reader.nextInt();
        int i2 = reader.nextInt();
        division(i1, i2);
        System.out.println("Operation / Enter two numbers long : ");
        long p1 = reader.nextLong();
        long p2 = reader.nextLong();
        division(p1, p2);
        System.out.println("Operation * Enter two numbers double : ");
        double k1 = reader.nextDouble();
        double k2 = reader.nextDouble();
        multiplication(k1, k2);
        System.out.println("Operation * Enter two numbers int : ");
        int j1 = reader.nextInt();
        int j2 = reader.nextInt();
        multiplication(j1, j2);
        System.out.println("Operation * Enter two numbers long : ");
        long h1 = reader.nextLong();
        long h2 = reader.nextLong();
        multiplication(h1, h2);
        System.out.println("Operation - Enter two numbers double : ");
        double g1 = reader.nextDouble();
        double g2 = reader.nextDouble();
        subtraction(g1, g2);
        System.out.println("Operation - Enter two numbers int : ");
        int f1 = reader.nextInt();
        int f2 = reader.nextInt();
        subtraction(f1, f2);
        System.out.println("Operation - Enter two numbers long : ");
        long q1 = reader.nextLong();
        long q2 = reader.nextLong();
        subtraction(q1, q2);
    }

    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("result +: " + result);
    }

    public static void sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("result +: " + result);
    }

    public static void sum(long num1, long num2) {
        long result = num1 + num2;
        System.out.println("result +: " + result);
    }

    public static void division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("result /: " + result);
    }

    public static void division(int num1, int num2) {
        int result = (num1 / num2)+ (num1%num2);
        System.out.println("result /: " + result);
    }

    public static void division(long num1, long num2) {
        long result = (num1 / num2)+ (num1%num2);
        System.out.println("result /: " + result);
    }

    public static void multiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("result *: " + result);
    }

    public static void multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("result *: " + result);
    }

    public static void multiplication(long num1, long num2) {
        long result = num1 * num2;
        System.out.println("result *: " + result);
    }

    public static void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("result -: " + result);
    }

    public static void subtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("result -: " + result);
    }

    public static void subtraction(long num1, long num2) {
        long result = num1 - num2;
        System.out.println("result -: " + result);
    }
}

