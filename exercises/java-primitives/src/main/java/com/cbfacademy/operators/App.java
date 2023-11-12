package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

       double add = operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        double subtract = operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        double multiply = operand1 * operand2;

    }

    public static Boolean areEqual(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        Boolean areEqual = operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");
        
        Boolean isLessThan = operand1 < operand2;

    public static Boolean isMoreThan(double operand1, double operand2) {
        //throw new RuntimeException("Not implemented");

        Boolean isMoreThan = operand1 > operand2;
    }
}
