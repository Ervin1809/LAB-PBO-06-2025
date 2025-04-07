package TP1;

import java.util.Scanner;

public class Soal4 {
    public static int faktorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(faktorial(n));
        scanner.close();
    }
}