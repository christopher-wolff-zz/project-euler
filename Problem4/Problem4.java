/**
 * Problem 4: Largest palindrome product
 *
 * https://projecteuler.net/problem=4
 */
 public class Problem4 {

     /**
      * Returns the largest palindrome that is a product of two 3-digit numbers
      */
     public static int solve() {
         int largest = 0;
         for (int i = 100; i < 1000; i++) {
             for (int j = 100; j < 1000; j++) {
                 int n = i * j;
                 if (isPalindrome(n)) {
                     largest = Math.max(largest, n);
                 }
             }
         }
         return largest;
     }

     private static boolean isPalindrome(int n) {
         String s = Integer.toString(n);
         int i = 0;
         int j = s.length() - 1;
         while (i <= j) {
             if (s.charAt(i) != s.charAt(j)) {
                 return false;
             }
             i++;
             j--;
         }
         return true;
     }

     public static void main(String[] args) {
         System.out.println(solve());
     }

 }
