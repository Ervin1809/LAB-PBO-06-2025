package kendaraan;

public class KapalLawd extends Kendaraan implements IBergerak {
    private String jenisKapal;
    private int kapasitasPenumpang;
    private double panjangKapal;
    private double kecepatan;

    public KapalLawd(String merek, String model, String jenisKapal, int kapasitasPenumpang, double panjangKapal, double kecepatan) {
        super(merek, model);
        this.jenisKapal = jenisKapal;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.panjangKapal = panjangKapal;
        this.kecepatan = kecepatan;
    }

    public String getJenisKapal() {
        return jenisKapal;
    }

    public void setJenisKapal(String jenisKapal) {
        this.jenisKapal = jenisKapal;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public double getPanjangKapal() {
        return panjangKapal;
    }

    public void setPanjangKapal(double panjangKapal) {
        this.panjangKapal = panjangKapal;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public double hitungPajak() {
        return 0; // Bisa dikustom sesuai logika pajak
    }

    @Override
    public String getTipeKendaraan() {
        return "KapalLawd";
    }

    public boolean mulai() {
        System.out.println("KapalLawd mulai berlayar");
        return true;
    }

    public boolean berhenti() {
        System.out.println("KapalLawd berhenti berlayar");
        return true;
    }
}
