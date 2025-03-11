package TP1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String[] kata = a.nextLine().split("\s+");
        a.close();
        for (int i = 0; i < kata.length; i++) {
            kata[i] = Character.toUpperCase(kata[i].charAt(0)) + kata[i].substring(1).toLowerCase();
        }
        System.out.println(String.join(" ", kata));
    }
}