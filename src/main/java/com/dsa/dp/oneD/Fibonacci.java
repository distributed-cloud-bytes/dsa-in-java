package com.dsa.dp.oneD;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    //Recursion
    public int fibUsingRecursion(int n) {
        if(n <= 1)                                                //0 <= n <= 30
            return n;
        return fibUsingRecursion(n - 2) + fibUsingRecursion(n - 1);
    }
    //Time complexity: O(2 ^ N)
    //Space complexity: O(N)

    //Bottom-Up Approach using Tabulation
    public int fibUsingTabulation(int n) {
        if(n <= 1)                                                //0 <= n <= 30
            return n;
        int []cache = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
    //Time complexity: O(N)
    //Space complexity: O(N)

    //Top-Down Approach using Memoization
    private Map<Integer, Integer> cache = new HashMap<>(Map.of(0,0,1,1));
    public int fibUsingMemoization(int n) {
        if(n <= 1)                                                //0 <= n <= 30
            return n;
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n, fibUsingMemoization(n-2)+fibUsingMemoization(n-1));
        return cache.get(n);
    }
    //Time complexity: O(N)
    //Space complexity: O(N)

    //Iterative Bottom-Up Approach
    public int fibUsingInPlace(int n) {
        if(n <= 1)                                                //0 <= n <= 30
            return n;
        int current = 0;
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 2; i <= n; i++) {                             //In place
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
    //Time complexity: O(N)
    //Space complexity: O(1)
}
