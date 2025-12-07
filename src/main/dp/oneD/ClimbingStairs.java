package dp.oneD;

public class ClimbingStairs {
    private static int n = 5;
    private static int[] memo = new int[n + 1];

    //Brute Force Or Recursion
    public static int climbStairsUsingBruteForce(int i, int n) {
        if(i > n)               //constraint check, if 0 > -1, Overshot, cannot reach target
            return 0;
        if(i == n)              //base condition to terminate recursion, basically if i(3) == n(3), to reach 3rd step we can only reach via previous step or step on it
            return 1;
        return climbStairsUsingBruteForce(i+1, n) + climbStairsUsingBruteForce(i+2, n);
    }
    public static int climbStairsUsingBruteForce_1(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 1;
        return climbStairsUsingBruteForce_1(n-2) + climbStairsUsingBruteForce_1(n-1);
    }
    //Time complexity : O(2^n). Size of recursion tree will be 2^n -->> recursion function call is twice, if its three times then O(3^n)... so on.
    //Space complexity : O(n)


    //Recursion with Memoization (recursion with advance to increase time complexity)
    public static int climbStairsUsingMemoization(int i, int n, int memo[]) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climbStairsUsingMemoization(i + 1, n, memo) + climbStairsUsingMemoization(i + 2, n, memo);
        return memo[i];
    }
    public static int climbStairsUsingMemoization_1(int n, int memo[]) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = climbStairsUsingMemoization_1(n -1, memo) + climbStairsUsingMemoization_1(n - 2, memo);
        return memo[n];
    }
    //Time complexity : O(n). Size of recursion tree can go upto n.
    //Space complexity : O(n). The depth of recursion tree can go upto n.


    //Bottom-Up Tabulation
    public static int climbStairsUsingTabulation(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    //Time complexity : O(n). Single loop upto n
    //Space complexity : O(n). dp array of size n is used.

    //Iterative Bottom-Up Approach => In place
    public static int climbStairsUsingInPlace(int n) {
        if (n <= 3)
            return n;
        int cur = 0;
        int prev1 = 3;
        int prev2 = 2;
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }
    //Time complexity : O(n). Single loop upto n is required to calculate n th fibonacci number.
    //Space complexity : O(1). constant space is used
}
