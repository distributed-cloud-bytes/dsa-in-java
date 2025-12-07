package com.dsa.dp.oneD;

import java.util.HashMap;

public class MinCostClimbingStairs {
/*    public static void main(String[] args) {
        int a[] = { 16, 19, 10, 12, 18 };
        System.out.print(minCostClimbingStairs1(a));
    }*/

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];

        if (n == 1)                             // base case
            return cost[0];

        dp[0] = cost[0];                        // initially to climb till 0-th or 1st stair
        dp[1] = cost[1];

        for (int i = 2; i < n; i++){
            dp[i] = Math.min(dp[i - 1],
                    dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 2], dp[n - 1]);      // return the minimum
    }
    //Time Complexity: O(N)
    //Auxiliary Space: O(N)


    //Space-optimized Approach
    public static int minCostClimbingStairsUsingSpaceOptimized(int[] cost) {
        int n = cost.length;
        int dp1 = 0, dp2 = 0;

        for (int i = 0; i < n; i++)
        {
            int dp0 = cost[i] + Math.min(dp1, dp2);
            dp2 = dp1;              // update the last two stairs value
            dp1 = dp0;
        }
        return Math.min(dp1, dp2);
    }
    //Time Complexity: O(N)
    //Auxiliary Space: O(1)


    //Bottom-Up Dynamic Programming (Tabulation)
    public static int minCostClimbingStairsUsingTabulation(int[] cost) {
        int minimumCost[] = new int[cost.length + 1];                   // The array's length should be 1 longer than the length of cost This is because we can treat the "top floor" as a step to reach

        for (int i = 2; i < minimumCost.length; i++) {                  // Start iteration from step 2, since the minimum cost of reaching step 0 and step 1 is 0
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoSteps = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        return minimumCost[minimumCost.length - 1];             // The final element in minimumCost refers to the top floor
    }
    //Time complexity: O(N)
    //Space complexity: O(N)


    //Top-Down Dynamic Programming (Recursion + Memoization)
    private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static int minCostClimbingStairsUsingMemoization(int[] cost) {
        return minimumCost(cost.length, cost);
    }

    private static int minimumCost(int i, int[] cost) {
        if (i <= 1) {                                       // Base case, we are allowed to start at either step 0 or step 1
            return 0;
        }
        if (memo.containsKey(i)) {                          // Check if we have already calculated minimumCost(i)
            return memo.get(i);
        }
        int downOne = cost[i - 1] + minimumCost(i - 1, cost);        // If not, cache the result in our hash map and return it
        int downTwo = cost[i - 2] + minimumCost(i - 2, cost);
        memo.put(i, Math.min(downOne, downTwo));
        return memo.get(i);
    }
    //Time complexity: O(N)
    //Space complexity: O(N)


    //Bottom-Up, Constant Space
    public static int minCostClimbingStairsUsingConstantSpace(int[] cost) {
        int downOne = 0;
        int downTwo = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int temp = downOne;
            downOne = Math.min(downOne + cost[i - 1], downTwo + cost[i - 2]);
            downTwo = temp;
        }
        return downOne;
    }
    //Time complexity: O(N)
    //Space complexity: O(1)
}
