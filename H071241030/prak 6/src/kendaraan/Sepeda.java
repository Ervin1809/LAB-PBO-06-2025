package kendaraan;

import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable{
    String jenisSepeda;
    int jumlahGeer;
    int ukuranRoda;
    double kecepatan;

    public Sepeda(String merek, String model, String jenisSepeda, int jumlahGeer, int ukuranRoda) {
        super(merek, model);
        this.jenisSepeda = jenisSepeda;
        this.jumlahGeer = jumlahGeer;
        this.ukuranRoda = ukuranRoda;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public int getJumlahGeer() {
        return jumlahGeer;
    }

    public void setJumlahGeer(int jumlahGeer) {
        this.jumlahGeer = jumlahGeer;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuranRoda) {
        this.ukuranRoda = ukuranRoda;
    }

    @Override
    double hitungPajak() {
        return 0;
    }

    @Override
    String getTipeKendaraan() {
        return "sepeda";
    }

    public boolean mulai() {
        System.out.println("sepeda bergerak");
        return true;
    }
    
    public boolean berhenti() {
        System.out.println("sepeda berhenti");
        return true;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean periksaKondisi() {
        System.out.println("sepeda sedang diperiksa");
        return true;
    }

    public void lakukanService() {
        System.out.println("sepeda sedang diservis");
        
    }

    public Date getServisBerikutnya() {
        Date sekarang = new Date();
        long satuBulanMs = 30L * 24 * 60 * 60 * 1000;
        return new Date(sekarang.getTime() + satuBulanMs);
    }

    public double hitungBiayaServis() {
        return 100000;
    }
}