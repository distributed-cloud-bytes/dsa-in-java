package dp.oneD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void testClimbStairsUsingBruteForce() {
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce(0, 5));
        assertEquals(1, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce(0, 0));
        assertEquals(2, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce(0, 2));
    }

    @Test
    void testClimbStairsUsingBruteForce_1() {
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce_1(5));
        assertEquals(1, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce_1(0));
        assertEquals(2, dp.oneD.ClimbingStairs.climbStairsUsingBruteForce_1(2));
    }

    @Test
    void testClimbStairsUsingMemoization() {
        int[] memo = new int[6];
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingMemoization(0, 5, memo));
        memo = new int[3];
        assertEquals(2, dp.oneD.ClimbingStairs.climbStairsUsingMemoization(0, 2, memo));
    }

    @Test
    void testClimbStairsUsingMemoization_1() {
        int[] memo = new int[6];
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingMemoization_1(5, memo));
        memo = new int[3];
        assertEquals(2, dp.oneD.ClimbingStairs.climbStairsUsingMemoization_1(2, memo));
    }

    @Test
    void testClimbStairsUsingTabulation() {
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingTabulation(5));
        assertEquals(1, dp.oneD.ClimbingStairs.climbStairsUsingTabulation(1));
        assertEquals(2, dp.oneD.ClimbingStairs.climbStairsUsingTabulation(2));
    }

    @Test
    void testClimbStairsUsingInPlace() {
        assertEquals(8, dp.oneD.ClimbingStairs.climbStairsUsingInPlace(5));
        assertEquals(1, dp.oneD.ClimbingStairs.climbStairsUsingInPlace(1));
        assertEquals(2, ClimbingStairs.climbStairsUsingInPlace(2));
    }
}