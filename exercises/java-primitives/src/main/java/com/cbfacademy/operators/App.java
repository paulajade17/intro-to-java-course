package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static double add(double operand1, double operand2) {
        

       double result = operand1 + operand2;

       return result;

    }

    public static double subtract(double operand1, double operand2) {
        

        double result = operand1 - operand2;

        return result;
    }

    public static double multiply(double operand1, double operand2) {
        

        double result = operand1 * operand2;

        return result;

    }

    public static Boolean areEqual(double operand1, double operand2) {
        

        Boolean result = operand1 == operand2;

        return result;



    }

    public static Boolean isLessThan(double operand1, double operand2) {
        
        
        Boolean result = operand1 < operand2;

        return result;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        

        Boolean result = operand1 > operand2;

        return result;
    }
}
