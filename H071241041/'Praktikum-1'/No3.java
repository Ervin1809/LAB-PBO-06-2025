import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tanggal (dd-mm-yy): ");
        String tanggal = input.nextLine();


        try {
            String[] bagian = tanggal.split("-");

            int hari = Integer.parseInt(bagian[0]);
            int bulan = Integer.parseInt(bagian[1]);
            int tahun = Integer.parseInt(bagian[2]);

            if (tahun <= 30) {
                tahun += 2000;
            } else {
                tahun += 1900;
            }

            String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
            };

            System.out.println(hari + " " + namaBulan[bulan - 1] + " " + tahun);

        } catch (Exception e) {
            System.out.println("Format tanggal tidak valid. Harus dd-mm-yy.");
        }

        input.close();
    }
}