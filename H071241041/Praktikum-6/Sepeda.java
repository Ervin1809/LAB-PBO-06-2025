public class Sepeda extends Kendaraan implements IBergerak, IServicable {
    String jenisSepeda;
    int jumlahGear;
    int ukuranRoda;
    double kecepatan;

    public Sepeda(String merek, String model, double kecepatan) {
        super(merek, model);
        this.kecepatan = kecepatan;
    }

    public void setJenisSepeda(String jenis) {
        this.jenisSepeda = jenis;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJumlahGear(int jumlah) {
        this.jumlahGear = jumlah;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setUkuranRoda(int ukuran) {
        this.ukuranRoda = ukuran;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public double hitungPajak() {
        return 0; 
    }

    public String getTipeKendaraan() {
        return "Sepeda";
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
        System.out.println("Servis sepeda dilakukan.");
        if (jenisSepeda == null) {
            System.out.println("Jenis sepeda belum diatur.");
        } else if (jenisSepeda.equalsIgnoreCase("Gunung")) {
            System.out.println("Cek suspensi dan ban medan berat.");
        } else if (jenisSepeda.equalsIgnoreCase("Lipat")) {
            System.out.println("Cek engsel dan lipatan.");
        } else {
            System.out.println("Cek rantai dan rem.");
        }
    }

    public String getWaktuServisBerikutnya() {
        return "90 hari dari sekarang";
    }

    public double hitungBiayaServis() {
        if (jenisSepeda == null) {
            return 80000;
        }

        if (jenisSepeda.equalsIgnoreCase("Gunung")) {
            return 120000;
        } else if (jenisSepeda.equalsIgnoreCase("Lipat")) {
            return 100000;
        } else {
            return 80000;
        }
    }
}
