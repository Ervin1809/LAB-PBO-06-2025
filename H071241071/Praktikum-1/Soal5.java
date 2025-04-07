package TP1;

import java.util.Scanner;

public class Soal5 {
    public static boolean Valid(String p) {
        return p.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}");
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println(Valid(a.nextLine()) ? "Password valid" : "Password tidak valid");
        a.close();
    }
}