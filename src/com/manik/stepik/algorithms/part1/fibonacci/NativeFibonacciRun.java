package com.manik.stepik.algorithms.part1.fibonacci;

public class NativeFibonacciRun {

    int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 42; i++) {
            long startTime = System.currentTimeMillis();
            new NativeFibonacciRun().run(i);
            long endTime = System.currentTimeMillis();
            System.out.println(", " + (endTime - startTime) + " ms, ");
        }
    }

    private int fibonaccin(int n) {
        count++;
        if (n < 2) return n;
        return fibonaccin(n - 1) + fibonaccin(n - 2);

    }

    private void run(int n) {
        System.out.print(fibonaccin(n) + ", " + count + " calls");
    }
}
