package org.math;

class Calculator {
    /*
     * Returns the average of the supplied integers.
     */
    public static double average(int first, int ... rest) { // 3, 5, 10, 13
        double result = 0.0;
        int sum = first;
        for (int value : rest) {
            sum += value;
        }

        result = (double) sum / (rest.length+1);
        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
    /*
    * Returns a random integer between 'min' and 'max' (inclusive).
    *
    * TODO: optional challenge - we will revisit this one in class
     */
    public static int randomInt(int min, int max){
        int result = 0;
        double rand = Math.random(); //0.0000 to 0.99999
        double scaled = (rand * (max - min + 1)) + min;
        result = (int) scaled;
        return result;
    }

    /*
    * Returns a random integer between 1 and 'max'
     */
    public static int randomInt(int max){
        return randomInt(1, max);// delegate for the min max version passing 1 for min
    }

    /*
    * Indicates if the supplied integer is even or not.
     */
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    //Returns a random integer between 1 and 16 (inclusive)
    public static int randomInt(){
        return randomInt(1, 16); // Delegate to the min max version passing 1 and 16 for min, max
    }


}