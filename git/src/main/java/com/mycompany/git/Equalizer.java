package com.mycompany.git;

public class Equalizer {

    private static int rSz = 0;

    public static void main(String[] args) {
        blokkok();

    }

    private static void blokkok() {
        eq();
        eq(8);
        eq(12);
        eq();
        eq(4);
        eq();
    }

    private static void eq() {
        int min = 3;
        int max = 12;
        rSz = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rSz) {
            System.out.printf("." + " ");
            index++;
        }
        System.out.println();

    }

    private static void eq(int sorszam) {
        int index = 0;
        while (index < sorszam) {
            System.out.printf("." + " ");
            index++;
        }
        System.out.println();
    }

    private static void eq(boolean szamolas) {

        int min = 3;
        int max = 12;
        rSz = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rSz) {
            System.out.printf("." + " ");
            index++;
        }
               if (szamolas == true){
            System.out.println("(" + rSz + ")");
    }
        else{
            System.out.println("");
        }
    }

    private static void eq(int sorszam, boolean szamolas) {

        int index = 0;
        while (index < sorszam) {
            System.out.printf("." + " ");
            index++;
        }

        if (szamolas == true){
            System.out.println("(" + sorszam + ")");
    }
        else{
            System.out.println("");
        }
   }

}