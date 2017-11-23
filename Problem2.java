/**
 * Problem 2: Even Fibonacci numbers
 *
 * https://projecteuler.net/problem=2
 */
 public class Problem2 {

     /**
      * Returns the sum of all even Fibonacci numbers who do not exceed n
      */
     public static int solve(int n) {
         int count = 0;
         int a = 1;
         int b = 2;
         while (a <= n) {
             if (a % 2 == 0) {
                 count += a;
             }
             int temp = a;
             a = b;
             b += temp;
         }
         return count;
     }

     public static void main(String[] args) {
         System.out.println(solve(4000000));
     }

 }
