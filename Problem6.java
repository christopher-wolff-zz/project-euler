/**
 * Problem 6: Sum square difference
 *
 * https://projecteuler.net/problem=6
 */
 public class Problem4 {

     /**
      * Returns the positive difference between the sum of the squares of the first n natural
      * numbers and the square of their sum
      */
     public static int solve(int n) {
         int sum = 0;
         int sumOfSquares = 0;
         for (int i = 1; i <= n; i++) {
             sum += i;
             sumOfSquares += i * i;
         }
         int squareOfSum = sum * sum;

         return squareOfSum - sumOfSquares;
     }

     public static void main(String[] args) {
         int input = (args.length > 0) ? Integer.valueOf(args[0]) : 100;
         System.out.println(solve(input));
     }

 }
