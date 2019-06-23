package com.manik.stepik.algorithms.part1.fibonacci;

public class NativeFibonacciArray {

    private static long[] seriesFibonacci;

    public static long fib(int n) {
        seriesFibonacci = new long[n + 1];
        seriesFibonacci[0] = 0;
        seriesFibonacci[1] = 1;
        return fib(n, seriesFibonacci);
    }

    public static long fib(int n, long[] seriesFibonacci) {
        if (n <= 1) return seriesFibonacci[n];
        else if (seriesFibonacci[n] > 0) return seriesFibonacci[n];
        else {
            seriesFibonacci[n] = fib(n - 1, seriesFibonacci) + fib(n - 2, seriesFibonacci);
            return seriesFibonacci[n];
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("fibonacci: " + fib(2000));
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}
