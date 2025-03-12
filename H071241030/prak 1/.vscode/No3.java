import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tanggal = input.nextLine().split("-");

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        int hari = Integer.parseInt(tanggal[0]);
        int bulan = Integer.parseInt(tanggal[1]);
        int tahun = Integer.parseInt(tanggal[2]);

        if (tahun < 25) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        System.out.println(hari + " " + namaBulan[bulan - 1] + " " + tahun);
        input.close();
    }
}
