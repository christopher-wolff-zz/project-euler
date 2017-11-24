/**
 * Problem 5: Smallest multiple
 *
 * https://projecteuler.net/problem=5
 */
public class Problem5 {

    /**
     * Returns the smallest multiple of the numbers 1 to n
     */
    public static int solve(int n) {
        int smallest = n;

        boolean divisible = false;
        outer:
        while (true) {
            for (int i = 1; i <= n; i++) {
                if (smallest % i != 0) {
                    smallest++;
                    continue outer;
                }
            }
            break;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int input = (args.length > 0) ? Integer.valueOf(args[0]) : 20;
        System.out.println(solve(input));
    }

}
