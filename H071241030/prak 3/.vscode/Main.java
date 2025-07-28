import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Wand tongkat1 = new Wand("kulit babi", 400);
        // Wand tongkat2 = new Wand();
        // Wand tongkat3 = new Wand("pasir", 140);

        // Wandcrafter penyihir1 = new Wandcrafter("dewi", "tongkat lipat", tongkat1);
        // Wandcrafter penyihir2 = new Wandcrafter();
        // Wandcrafter penyihir3 = new Wandcrafter("walid", "tongkat terbang", tongkat2);

        // penyihir1.identitas();
        // System.out.println();
        
        // penyihir3.identitas();
        // System.out.println();

        // penyihir3.identitas();
        // System.out.println();
        // penyihir1.perbandinganTongkat(penyihir3);
        
        // penyihir2.perbandinganTongkat(penyihir1);
        // System.out.println();
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan elemen: ");
        String elemen = input.nextLine();
        System.out.print("masukkan kekuatan: ");
        int kekuatan = input.nextInt();
        input.nextLine();
        System.out.print("masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("masukkan spesialisasi: ");
        String spesialisasi = input.nextLine();

        Wand tongkat = new Wand(elemen, kekuatan);
        Wandcrafter penyihir = new Wandcrafter(nama, spesialisasi, tongkat);

    
        tongkat.setElemen(elemen);
        penyihir.identitas();

    }
     
}