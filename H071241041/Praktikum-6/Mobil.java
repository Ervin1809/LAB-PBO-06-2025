public class Mobil extends Kendaraan implements IBergerak, IServicable {
    int jumlahPintu;
    int jumlahKursi;
    double kapasitasMesin;
    String bahanBakar;
    double kecepatan;

    public Mobil(String merek, String model) {
        super(merek, model);
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setKapasitasMesin(double kapasitas) {
        this.kapasitasMesin = kapasitas;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public double hitungPajak() {
        return kapasitasMesin * 100;
    }

    public String getTipeKendaraan() {
        return "Mobil";
    }

    public boolean mulai() {
        return true;
    }

    public boolean berhenti() {
        kecepatan = 0;
        return true;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatanBaru) {
        kecepatan = kecepatanBaru;
    }

    public boolean periksaKondisi() {
        return true;
    }

    public void lakukanServis() {
        System.out.println("Servis mobil dilakukan.");

        if (bahanBakar == null) {
            System.out.println("Jenis bahan bakar belum diatur.");
            return;
        }

        if (bahanBakar.equalsIgnoreCase("Listrik")) {
            System.out.println("Cek baterai dan sistem listrik.");
        } else if (bahanBakar.equalsIgnoreCase("Hybrid")) {
            System.out.println("Cek mesin dan baterai hybrid.");
        } else if (bahanBakar.equalsIgnoreCase("Solar")) {
            System.out.println("Ganti filter solar.");
        } else {
            System.out.println("Servis mesin bensin.");
        }
    }

    public String getWaktuServisBerikutnya() {
        return "30 hari dari sekarang";
    }

    public double hitungBiayaServis() {
        if (bahanBakar == null) {
            return 0;
        }

        if (bahanBakar.equalsIgnoreCase("Listrik")) {
            return 300000;
        } else if (bahanBakar.equalsIgnoreCase("Hybrid")) {
            return 550000;
        } else {
            return 500000; 
        }
    }
}
