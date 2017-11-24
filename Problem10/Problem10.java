/**
 * Problem 10: Summation of primes
 *
 * https://projecteuler.net/problem=10
 */
public class Problem10 {

    /**
     * Returns the sum of all primes below n
     */
    public static long solve(int n) {
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int input = (args.length > 0) ? Integer.valueOf(args[0]) : 2000000;
        System.out.println(solve(input));
    }

}
