/**
 * Problem 7: Smallest multiple
 *
 * https://projecteuler.net/problem=7
 */
 public class Problem7 {

     /**
      * Returns the nth prime number
      */
     public static int solve(int n) {
         int currentPrime = 2;
         for (int i = 0; i < n; i++) {
             while (!isPrime(currentPrime)) {
                 currentPrime++;
             }
             currentPrime++;
         }
         return --currentPrime;
     }

     private static boolean isPrime(int n) {
         for (int i = 2; i < n; i++) {
             if (n % i == 0) {
                 return false;
             }
         }
         return true;
     }

     public static void main(String[] args) {
         int input = (args.length > 0) ? Integer.valueOf(args[0]) : 10001;
         System.out.println(solve(input));
     }

 }
