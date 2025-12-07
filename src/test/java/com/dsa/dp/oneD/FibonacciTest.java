package com.dsa.dp.oneD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void fibUsingRecursionHandlesBaseCases() {
        assertEquals(0, new Fibonacci().fibUsingRecursion(0));
        assertEquals(1, new Fibonacci().fibUsingRecursion(1));
    }

    @Test
    void fibUsingRecursionHandlesSmallNumbers() {
        assertEquals(1, new Fibonacci().fibUsingRecursion(2));
        assertEquals(2, new Fibonacci().fibUsingRecursion(3));
        assertEquals(3, new Fibonacci().fibUsingRecursion(4));
    }

    @Test
    void fibUsingTabulationHandlesBaseCases() {
        assertEquals(0, new Fibonacci().fibUsingTabulation(0));
        assertEquals(1, new Fibonacci().fibUsingTabulation(1));
    }

    @Test
    void fibUsingTabulationHandlesSmallNumbers() {
        assertEquals(1, new Fibonacci().fibUsingTabulation(2));
        assertEquals(2, new Fibonacci().fibUsingTabulation(3));
        assertEquals(3, new Fibonacci().fibUsingTabulation(4));
    }

    @Test
    void fibUsingMemoizationHandlesBaseCases() {
        assertEquals(0, new Fibonacci().fibUsingMemoization(0));
        assertEquals(1, new Fibonacci().fibUsingMemoization(1));
    }

    @Test
    void fibUsingMemoizationHandlesSmallNumbers() {
        assertEquals(1, new Fibonacci().fibUsingMemoization(2));
        assertEquals(2, new Fibonacci().fibUsingMemoization(3));
        assertEquals(3, new Fibonacci().fibUsingMemoization(4));
    }

    @Test
    void fibUsingInPlaceHandlesBaseCases() {
        assertEquals(0, new Fibonacci().fibUsingInPlace(0));
        assertEquals(1, new Fibonacci().fibUsingInPlace(1));
    }

    @Test
    void fibUsingInPlaceHandlesSmallNumbers() {
        assertEquals(1, new Fibonacci().fibUsingInPlace(2));
        assertEquals(2, new Fibonacci().fibUsingInPlace(3));
        assertEquals(3, new Fibonacci().fibUsingInPlace(4));
    }
}