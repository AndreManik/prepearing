package com.manik.stepik.algorithms.part1.NOD;

public class EuklidNOD {

    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        new EuklidNOD().run(112223232,412123128);
        long fullTime = System.currentTimeMillis() - startTime;
        System.out.println(", " + fullTime + " ms");
    }

    private void run(int n, int d) {
        System.out.print("del: " + NOD(n, d));
    }

    private int NOD(int n, int d) {
        int nod = 0;
        while (true) {
            if (n == 0) return d;
            if (d == 0) return n;

            if (n >= d) {
                n %= d;
            }
            else {
                d %= n;
            }
        }
    }
}
