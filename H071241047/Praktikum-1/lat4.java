// package praktikum1;

import java.util.Scanner;
public class lat4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Faktorial: ");
        String bilanganstr = input.nextLine();
        int bilangan = Integer.parseInt(bilanganstr);

        long faktorial = 1;
        
        for (int angka = 1; angka <= bilangan; angka++) {
            faktorial *= angka;
        }
        System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        input.close();
    }
}
