package org.example;

public class TriangleNumberCalculator {

    /**
     * Returns the n-th triangular number using recursion.
     * @param n index (must be >= 0)
     * @return T(n)
     * @throws IllegalArgumentException if n < 0
     */
    public int value(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n <= 1) {
            return n; // T(0)=0, T(1)=1
        }
        return n + value(n - 1);
    }

    /**
     * Adds the n-th and m-th triangular numbers.
     * @param n index (>= 0)
     * @param m index (>= 0)
     * @return T(n) + T(m)
     * @throws IllegalArgumentException if n < 0 or m < 0
     */
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    /**
     * Subtracts the m-th triangular number from the n-th.
     * @param n index (>= 0)
     * @param m index (>= 0)
     * @return T(n) - T(m)
     * @throws IllegalArgumentException if n < 0 or m < 0
     */
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }
}