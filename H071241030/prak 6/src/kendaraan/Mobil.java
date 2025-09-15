package kendaraan;

import java.util.Date;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    int jumlahPintu;
    double kapasitasMesin;
    int jumlahKursi;
    String bahanBakar;
    double kecepatan;

    public Mobil(String merek, String model, int jumlahPintu, double kapasitasMesin, int jumlahKursi, String bahanBakar, double kecepatan) {
        super(merek, model);
        this.jumlahPintu = jumlahPintu;
        this.kapasitasMesin = kapasitasMesin;
        this.jumlahKursi = jumlahKursi;
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
    }


    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        return kapasitasMesin * 0.2;
    }

    @Override
    public String getTipeKendaraan() {
        return "mobil";
    }

    @Override
    public boolean mulai() {
        System.out.println("Mobil menyala");
        return true;
    }

  
    public boolean berhenti() {
        System.out.println("Mobil berhenti");
        return true;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean periksaKondisi() {
        System.out.println("Mobil sedang diperiksa");
        return true;
    }

    public void lakukanService() {
        System.out.println("Mobil sedang diservis");
    }

    public Date getServisBerikutnya() {
        Date sekarang = new Date();
        long satuBulanMs = 30L * 24 * 60 * 60 * 1000;
        return new Date(sekarang.getTime() + satuBulanMs);
    }

    public double hitungBiayaServis() {
        return 500000; 
    }
}