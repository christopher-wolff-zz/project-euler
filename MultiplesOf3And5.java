/**
 * https://projecteuler.net/problem=1
 */
public class MultiplesOf3And5 {

    /**
     * Calculates the numbers below n that are mutiples of 3 or 5
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
        System.out.println(solve(1000));
    }

}
