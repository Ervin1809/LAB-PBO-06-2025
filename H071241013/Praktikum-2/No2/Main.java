package No2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validasi valid = new Validasi();
        Scanner input = new Scanner(System.in);

        String ID = input.nextLine();
        String nama = input.nextLine();
        int Stok = input.nextInt();
        int Harga = input.nextInt();

        valid.id = ID;
        valid.nama = nama;
        valid.stok = Stok;
        valid.harga = Harga;

        valid.getItem();

        // Validasi valid = new Validasi();
        // valid.id = "A01";
        // valid.nama = "Laptop";
        // valid.stok = 2;
        // valid.harga = 1000;
        // valid.getItem();
    }
}
