package dsa_practice;

// Question Link : https://www.hackerrank.com/contests/dsa003/challenges

public class CoinChange {
    public static void main(String[] args) {
        Long[] coins = {1L, 2L, 3L};
        int n = 10;
        long[] dp = new long[n + 1];

        dp[0] = 1; // base case

        for (Long coin : coins) {

            int c = coin.intValue(); // convert Long → int

            for (int amount = c; amount <= n; amount++) {

                dp[amount] += dp[amount - c];

            }
        }

        System.out.println(dp[n]);
    }
}
