package com.mycompany.git;

public class Qr {

    public static void main(String[] args) {
        eq();
    }

    private static void eq() {
        int min = 1;
        int max = 10;
        int randnom1, random2;
        int sorok = 0;
        while (sorok < 5) {
            int index = 0;
            while (index < 20) {
                randnom1 = (int) (Math.random() * (max - min + 1) + min);
                random2 = (int) (Math.random() * ((max + 10) - min + 1) + (min + 10));
                if (index == randnom1 || index == random2) {
                    System.out.printf(".");
                } else {
                    System.out.printf("*");
                }
                index++;
            }
            sorok++;
            System.out.println();
        }
    }
}
