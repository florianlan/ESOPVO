package com.KlausSchoeffmann;

public class ZahlenUndAusdruecke {
    public static void main(String[] args) {

        /////////////////////////////////
        // Ganze Zahlen & Gleitkommazahlen
        /////////////////////////////////
        int a = 10, b = 20;
        int c = a * b; //bleibt int (200)
        double d1 = 10 * (double)b; //type cast zu double, Ergebnis des Ausdrucks auch double (200.0)
        float f1 = (float)d1; //type cast zu float

        double d2 = 1.32e3; //1320.0
        float f2 = 1.32e-3f; //0.00132

        int x1 = 4, y1 = 3;
        int result1 = x1 / y1; //1
        double result2 = x1 / (double)y1; //1.33...
        System.out.println("result1=" + result1 + " result2=" + result2);


        /////////////////////////////////
        // Beispiel Increment-Operator
        /////////////////////////////////
        int x = 10;
        int y = x++ * 3 + x * 2; //52
        int z1 = x++; //11
        int z2 = ++x; //13
        // x == 13
        System.out.println("y="+ y + " z1=" + z1 + " z2=" + z2 + " x=" + x);
    }
}
