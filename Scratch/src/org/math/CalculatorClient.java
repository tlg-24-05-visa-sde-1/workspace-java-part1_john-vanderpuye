package org.math;


class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(1.5, 4.5); // passing doubles where doubles are expected
        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1, 4)); // BUT HERE we pass ints

        boolean result = Calculator.isEven(9);
        System.out.println("result is: " + result);

        int winner = Calculator.randomInt(5,20);

        System.out.println("The winner is: " + winner);

        double average = Calculator.average(3,5,10,13);
        System.out.println("The average is: " + average);


    }
}