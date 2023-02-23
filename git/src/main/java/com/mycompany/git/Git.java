package com.mycompany.git;

public class Git {

    public static void main(String[] args) {
        String szoveg="";
        kiIr(szoveg);
    }

    private static int elso10() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;

        }
        return osszeg;
    }

    private static int osszead(int b, int a) {
        return a + b;
    }

    private static void kiIr(String szoveg) {
        szoveg = Integer.toString(elso10());
        System.out.println(szoveg);
        szoveg = Integer.toString(osszead(1, 2));
        System.out.println(szoveg);
        szoveg = Integer.toString(negyszamosszege(3, 4, 1, 5));
        System.out.println(szoveg);
        szoveg = Integer.toString(haromszamgyok(2, 5, 1));
        System.out.println(szoveg);
    }
    private static int negyszamosszege(int a, int b, int c, int d) {
        return a + b + c + d;
    }

     private static int haromszamgyok(int a, int b, int c) {
        int szam = a + b + c;
         return (int) Math.sqrt(szam);
    }

}
