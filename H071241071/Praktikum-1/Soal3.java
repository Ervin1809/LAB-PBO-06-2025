package TP1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String[] p = a.nextLine().split("-");

        int day = Integer.parseInt(p[0]);
        int month = Integer.parseInt(p[1]);
        int year = Integer.parseInt(p[2]) + (Integer.parseInt(p[2]) < 50 ? 2000 : 1900);

        String[] months = { "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember" };

        System.out.println(day + " " + months[month] + " " + year);
        a.close();
    }
}