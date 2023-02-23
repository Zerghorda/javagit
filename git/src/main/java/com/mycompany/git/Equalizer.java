package com.mycompany.git;

public class Equalizer {

    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        int i = 0;
        while (i < 7){
        int rand = (int) (Math.random()*(max-min+1)+min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
         System.out.println();
         i++;
        }
    }
}
