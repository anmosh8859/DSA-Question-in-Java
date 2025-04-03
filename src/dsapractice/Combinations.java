package dsapractice;

public class Combinations {
    public static long combinations(int n, int r) {
        if (r < 0 || r > n) {
            return 0; // Invalid input
        }
        if (r == 0 || r == n) {
            return 1; // Base cases
        }
        if (r > n / 2) {
            r = n - r; // Optimization: calculate smaller r
        }

        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
