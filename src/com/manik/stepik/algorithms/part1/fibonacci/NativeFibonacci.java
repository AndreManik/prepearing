package com.manik.stepik.algorithms.part1.fibonacci;

public class NativeFibonacci {

    public static long fib(long n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-1);
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("fibonacci: " + fib(50));
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}
