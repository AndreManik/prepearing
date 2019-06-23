package com.manik.stepik.algorithms.part1.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class NativeFibonacciCache {

    Map<Integer, BigInteger> cache = new HashMap<>();
    int count;

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            long startTime = System.currentTimeMillis();
            new NativeFibonacciCache ().run(i);
            long endTime = System.currentTimeMillis();
            System.out.println(", " + (endTime - startTime) + " ms, ");
        }
    }

    private void run(int n) {
        System.out.print(fibonacci(n) + ", " + count + " calls");
    }

    private BigInteger fibonacci(int n) {
        count++;
        if (n < 2) return BigInteger.ONE;
        if (cache.containsKey(n)) return cache.get(n);
        cache.put(n, fibonacci(n - 1).add(fibonacci(n - 2)));
        return cache.get(n);
    }
}
