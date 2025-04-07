// package praktikum1;
import java.util.Scanner;

public class lat1 {
    public static String kapitalisasi(String str) {
        String[] kata = str.split(" ");
        String[] kapital = new String[kata.length];
        for (int i = 0; i < kata.length; i++) {
            String huruf = kata[i];
            if (!huruf.isEmpty()) {
                String kapitalisasi = huruf.substring(0, 1).toUpperCase() + huruf.substring(1).toLowerCase();
                kapital[i] = kapitalisasi;
            }
        }
        return String.join(" ", kapital);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine();

        String output = kapitalisasi(input);
        System.out.println(output);

        scanner.close();
    }

}