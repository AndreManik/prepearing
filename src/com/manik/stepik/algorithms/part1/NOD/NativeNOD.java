package com.manik.stepik.algorithms.part1.NOD;

public class NativeNOD {

    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        new NativeNOD().run(112223232,412123128);
        long fullTime = System.currentTimeMillis() - startTime;
        System.out.println(", " + fullTime + " ms");
    }

    private void run(int n, int d) {
        System.out.print("del: " + NOD(n, d));
    }

    private int NOD(int n, int d) {
        int del = 1;

        for (int i = 2; i <= (n < d ? d : n); i++) {
            if ((n%i == 0) && (d%i == 0)) {
                del = i;
            }
        }
        return del;
    }
}
