import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
    }
    static Scanner input = new Scanner(System.in);
    static Hero karakter;
    
    private static void runApp() {
        System.out.println("Pilih karakter: ");
        System.out.println("1.Archer");
        System.out.println("2.Wizard");
        System.out.println("3.Fighter");
        System.out.print("Masukkan pilihan: ");
        int pilihan1 = input.nextInt();
        input.nextLine();
        System.out.print("masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("masukkan health: ");
        int health = input.nextInt();

        Menu(pilihan1, nama, health);
    }

    private static void Menu(int pilihan1, String nama, int health) {
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1.Serang");
            System.out.println("2.Keluar");
            System.out.print("Pilih aksi: ");
            int pilihan2 = input.nextInt();
            
            if (pilihan2 == 1 ) {
                if (pilihan1 == 1) {
                    karakter = new Pemanah(nama, health, 15);
                } else if (pilihan1 == 2) {
                    karakter = new Penyihir(nama, health, 25);
                } else {
                    karakter = new Petarung(nama, health, 56);
                }

                karakter.Serang();
            } else if (pilihan2 == 2) {
                System.out.println("Game selesai!");
                break;
                
            } else {
                System.out.println("inputan tidak valid");
            }

        }


    }


}
