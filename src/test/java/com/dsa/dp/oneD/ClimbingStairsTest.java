package com.dsa.dp.oneD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void testClimbStairsUsingBruteForce() {
        assertEquals(8, ClimbingStairs.climbStairsUsingBruteForce(0, 5));
        assertEquals(1, ClimbingStairs.climbStairsUsingBruteForce(0, 0));
        assertEquals(2, ClimbingStairs.climbStairsUsingBruteForce(0, 2));
    }

    @Test
    void testClimbStairsUsingBruteForce_1() {
        assertEquals(8, ClimbingStairs.climbStairsUsingBruteForce_1(5));
        assertEquals(1, ClimbingStairs.climbStairsUsingBruteForce_1(0));
        assertEquals(2, ClimbingStairs.climbStairsUsingBruteForce_1(2));
    }

    @Test
    void testClimbStairsUsingMemoization() {
        int[] memo = new int[6];
        assertEquals(8, ClimbingStairs.climbStairsUsingMemoization(0, 5, memo));
        memo = new int[3];
        assertEquals(2, ClimbingStairs.climbStairsUsingMemoization(0, 2, memo));
    }

    @Test
    void testClimbStairsUsingMemoization_1() {
        int[] memo = new int[6];
        assertEquals(8, ClimbingStairs.climbStairsUsingMemoization_1(5, memo));
        memo = new int[3];
        assertEquals(2, ClimbingStairs.climbStairsUsingMemoization_1(2, memo));
    }

    @Test
    void testClimbStairsUsingTabulation() {
        assertEquals(8, ClimbingStairs.climbStairsUsingTabulation(5));
        assertEquals(1, ClimbingStairs.climbStairsUsingTabulation(1));
        assertEquals(2, ClimbingStairs.climbStairsUsingTabulation(2));
    }

    @Test
    void testClimbStairsUsingInPlace() {
        assertEquals(8, ClimbingStairs.climbStairsUsingInPlace(5));
        assertEquals(1, ClimbingStairs.climbStairsUsingInPlace(1));
        assertEquals(2, ClimbingStairs.climbStairsUsingInPlace(2));
    }
}