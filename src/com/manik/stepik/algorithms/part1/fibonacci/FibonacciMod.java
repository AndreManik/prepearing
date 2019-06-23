package com.manik.stepik.algorithms.part1.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciMod {

    private static final int MOD = (int)(1e9 + 7);

    private List<Integer> cache = new ArrayList<>();
    {
        cache.add(0);
        cache.add(1);
    }

    private int calls = 0;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new FibonacciMod().run(100000);
        long endTime = System.currentTimeMillis();
        System.out.println(", " + (endTime - startTime) + " ms, ");
    }

    private void run(int n) {
        System.out.print(fibonacci(n) + ", " + calls + " calls");
    }

    private Integer fibonacci(int n) {
        calls++;
        for (int i = cache.size(); i <= n; i++) {
            cache.add((cache.get(i-1) + (cache.get(i-2)))%MOD);
        }
        return cache.get(n);
    }
}
