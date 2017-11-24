/**
 * Problem 9: Special Pythagorean triplet
 *
 * https://projecteuler.net/problem=9
 */
public class Problem9 {

    /**
     * Returns the product of the only set of three numbers where a^2 + b^2 = c^2 and
     * a + b + c = 1000
     */
    public static int solve() {
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                double c = Math.sqrt(a * a + b * b);
                if (c == Math.floor(c) && a + b + c == 1000) {
                    return a * b * (int) c;
                }
            }
        }
        return -1;
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
        System.out.println(solve());
    }

}
