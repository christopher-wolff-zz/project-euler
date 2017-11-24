import java.util.Scanner;

/**
 * Problem 11: Summation of primes
 *
 * https://projecteuler.net/problem=11
 */
public class Problem11 {

    /**
     * Returns the largest product of four collinear adjacent numbers in the given grid
     */
    public static int solve() {
        int[][] grid = new int[20][20];
        Scanner in = new Scanner(System.in);
        for (int r = 0; in.hasNextLine(); r++) {
            String[] line = in.nextLine().split(" ");
            for (int c = 0; c < line.length; c++) {
                grid[r][c] = Integer.valueOf(line[c]);
            }
        }

        int maxProduct = -Integer.MAX_VALUE;

        // horizontal
        for (int r = 0; r < 20; r++) {
            for (int c = 0; c < 17; c++) {
                int product = grid[r][c] * grid[r][c+1] * grid[r][c+2] * grid[r][c+3];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        // vertical
        for (int r = 0; r < 17; r++) {
            for (int c = 0; c < 20; c++) {
                int product = grid[r][c] * grid[r+1][c] * grid[r+2][c] * grid[r+3][c];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        // diagonal - top left to bottom right
        for (int r = 0; r < 17; r++) {
            for (int c = 0; c < 17; c++) {
                int product = grid[r][c] * grid[r+1][c+1] * grid[r+2][c+2] * grid[r+3][c+3];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        // diagonal - top right to bottom left
        for (int r = 0; r < 17; r++) {
            for (int c = 3; c < 20; c++) {
                int product = grid[r][c] * grid[r+1][c-1] * grid[r+2][c-2] * grid[r+3][c-3];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        System.out.println(solve());
    }

}
