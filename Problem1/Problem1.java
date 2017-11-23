/**
 * Problem 1: Multiples of 3 and 5
 *
 * https://projecteuler.net/problem=1
 */
public class Problem1 {

    /**
     * Returns the sum of the numbers below n that are mutiples of 3 or 5
     */
    public static int solve(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int input = (args.length > 0) ? Integer.valueOf(args[0]) : 1000;
        System.out.println(solve(input));
    }

}
