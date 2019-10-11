package com.KlausSchoeffmann;

public class SummiereZahlen {
    public static void main(String[] args) {
        int result1 = summiereZahlen(2); //1 + 2
        int result2 = summiereZahlen(5); //1 + 2 + 3 + 4 + 5
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public static int summiereZahlen(int max) {
        int sum = 0;
        int zahl = 1;
        while (zahl <= max) {
            sum += zahl;
            zahl++;
        }
        return sum;
    }
}
