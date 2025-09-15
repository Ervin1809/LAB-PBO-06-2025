package kendaraan;

import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    String jenisMotor;
    double kapasitasTangki;
    String tipeSuspensi;
    double kecepatan;
   
    public Motor(String merek, String model, String jenisMotor, double kapasitasTangki, String tipeSuspensi, double kecepatan) {
        super(merek, model);
        this.jenisMotor = jenisMotor;
        this.kapasitasTangki = kapasitasTangki;
        this.tipeSuspensi = tipeSuspensi;
        this.kecepatan = kecepatan;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipeSuspensi) {
        this.tipeSuspensi = tipeSuspensi;
    }

    @Override
    double hitungPajak() {
        return kapasitasTangki * 0.1;
    }

    @Override
    String getTipeKendaraan() {
        return "motor";
    }

    
    public boolean mulai() {
        System.out.println("motor nyala");
        return true;
    }

   
    public boolean berhenti() {
        System.out.println("motor berhenti");
        return true;
    }

    
    public double getKecepatan() {
        return kecepatan;
    }

   
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
        
    }

    
    public boolean periksaKondisi() {
        System.out.println("motor sedang diperiksa");
        return true;
    }

    
    public void lakukanService() {
        System.out.println("mobil sedang diservis");
        
    }

    
    public Date getServisBerikutnya() {
        Date sekarang = new Date();
        long satuBulanMs = 30L * 24 * 60 * 60 * 1000;
        return new Date(sekarang.getTime() + satuBulanMs);
    }

  
    public double hitungBiayaServis() {
        return 300000;
    }
}
