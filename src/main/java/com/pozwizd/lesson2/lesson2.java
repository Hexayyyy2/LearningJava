package com.pozwizd.lesson2;

public class lesson2 {

    static int a = 20;
    static int b = 10;
    static double c = 3.14, d = 6.6;

    public static void main(String[] args) {
        System.out.println("Целое число: ");
        System.out.println(suma(a, b) + "\n" + minus(a,b) + "\n" + multiply(a,b) + "\n" + divide(a,b));
        System.out.println("C плавающей точкой: ");
        System.out.println(suma(c,d) + "\n" + minus(c,d) + "\n" + multiply(c,d) + "\n" + divide(c,d));
    }
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
    public static double suma(double a, double b) {
        return a + b;
    }
    public static double minus(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}
