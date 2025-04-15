// package TmpOopTP.TP3;

public class Senjata {
    String namaSenjata;
    int kekuatan;
    String tipe;

    public Senjata() {
        this.namaSenjata = "Tanpa Senjata";
        this.kekuatan = 0;
        this.tipe = "Tidak Diketahui";
    }

    public Senjata(String namaSenjata, int kekuatan, String tipe) {
        this.namaSenjata = namaSenjata;
        this.kekuatan = kekuatan;
        this.tipe = tipe;
    }

    public void tampilkanInfoSenjata() {
        System.out.println("Nama Senjata: " + namaSenjata);
        System.out.println("Kekuatan: " + kekuatan);
        System.out.println("Tipe: " + tipe);
    }

    public int getKekuatan() {
        return kekuatan;
    }
}
