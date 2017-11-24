/**
 * Problem 3: Largest prime factor
 *
 * https://projecteuler.net/problem=3
 */
public class Problem3 {
    /**
     * Returns the largest prime factor of n
     */
    public static long solve(long n) {
        long largest = 1L;
        for (long i = 2L; i <= n; i++) {
            if (n % i == 0) {
                largest = Math.max(largest, i);
                n /= i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        long input = (args.length > 0) ? Long.valueOf(args[0]) : 600851475143L;
        System.out.println(solve(input));
    }
}
