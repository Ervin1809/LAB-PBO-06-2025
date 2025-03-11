package TP1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        int[][] angka = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
        };
        Scanner a = new Scanner(System.in);
        try {
            int target = a.nextInt();

            for (int i = 0; i < angka.length; i++)
                for (int j = 0; j < angka[i].length; j++)
                    if (angka[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        return;
                    }
            System.out.println("Angka tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Input tidak valid.");
        } finally {
            a.close();
        }
    }
}
