public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
