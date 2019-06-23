package com.manik.stepik.algorithms.part1.fibonacci;

public class FibonacciBest {

    private static final int MOD = (int)(1e9 + 7);
    private int calls = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new FibonacciBest().run(100000);
        long endTime = System.currentTimeMillis();
        System.out.println(", " + (endTime - startTime) + " ms, ");
    }

    private void run(int n) {
        System.out.print(fibonacci(n) + ", " + calls + " calls");
    }

    private Integer fibonacci(int n) {
        calls++;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return a;
    }
}
