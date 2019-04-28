package math.problems;

import org.testng.Assert;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

         //calling method
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(40);

    }

    //write fibonacci numbers till 40 ;
    public void fibonacci(int x) {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.println("Fibonacci numbers till " + x + " are : ");

        //getting fibonacci number by adding

        for (int i = 0; i <= x; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }


    }
}
