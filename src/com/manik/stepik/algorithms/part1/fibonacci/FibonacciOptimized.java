package com.manik.stepik.algorithms.part1.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciOptimized {

    List<BigInteger> cache = new ArrayList<>();
    int count = 0;

    {
        cache.add(BigInteger.ZERO);
        cache.add(BigInteger.ONE);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            long startTime = System.currentTimeMillis();
            new FibonacciOptimized ().run(i);
            long endTime = System.currentTimeMillis();
            System.out.println(", " + (endTime - startTime) + " ms, ");
        }
    }

    private void run(int n) {
        System.out.print(fibonacci(n) + ", " + count + " calls");
    }

    private BigInteger fibonacci(int n) {
        count++;
        for (int i = cache.size(); i <= n; i++) {
            cache.add(cache.get(i-1).add(cache.get(i-2)));
        }
        return cache.get(n);
    }
}
