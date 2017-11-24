/**
 * Problem 12: Highly divisible triangular number
 *
 * https://projecteuler.net/problem=12
 */
public class Problem12 {

    /**
     * Returns the first triangle number to have over n divisors
     */
    public static long solve(int n) {
        long triangle = 0;
        int i = 1;
        while (numDivs(triangle) < n) {
            triangle += i++;
        }
        return triangle;
    }

    /**
     * Returns the number of divisors of n
     */
    private static int numDivs(long n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        double d = Math.sqrt(n);
        if (d == Math.round(d)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int input = (args.length > 0) ? Integer.valueOf(args[0]) : 500;
        System.out.println(solve(input));
    }

}
