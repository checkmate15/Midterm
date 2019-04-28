package math.problems;

import org.testng.Assert;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //calling factorial method
        Factorial factorial = new Factorial();
        long value = 5;

        //printing results
        long number = factorial.factorial(value);
        System.out.println(number);

           }

           //creating method
    public long factorial(long x) {
        long number = 1;
        //getting fatorial by multipling each value with other
        for (long i = 1; i <= x; i++) {
            number = number * i;
        }
        return number;

    }
}
