public class Motor extends Kendaraan implements IBergerak, IServicable {
    String jenisMotor;
    double kapasitasTangki;
    String tipeSuspensi;
    double kecepatan;

    public Motor(String merek, String model) {
        super(merek, model);
    }

    public void setJenisMotor(String jenis) {
        this.jenisMotor = jenis;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setKapasitasTangki(double kapasitas) {
        this.kapasitasTangki = kapasitas;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setTipeSuspensi(String tipe) {
        this.tipeSuspensi = tipe;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public double hitungPajak() {
        return kapasitasTangki * 75;
    }

    public String getTipeKendaraan() {
        return "Motor";
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
        System.out.println("Servis motor dilakukan.");
        if (jenisMotor == null) {
            System.out.println("Jenis motor belum diatur.");
        } else if (jenisMotor.equalsIgnoreCase("Matic")) {
            System.out.println("Cek CVT dan belt.");
        } else if (jenisMotor.equalsIgnoreCase("Sport")) {
            System.out.println("Cek rantai dan performa mesin.");
        } else if (jenisMotor.equalsIgnoreCase("Manual")){
            System.out.println("Cek kopling, gigi transmisi, dan rantai.");
        } else {
            System.out.println("Cek keseluruhan motor.");
        }
    }

    public String getWaktuServisBerikutnya() {
        return "20 hari dari sekarang";
    }

    public double hitungBiayaServis() {
        if (jenisMotor == null) {
            return 200000;
        }

        if (jenisMotor.equalsIgnoreCase("Matic")) {
            return 250000;
        } else if (jenisMotor.equalsIgnoreCase("Sport")) {
            return 300000;
        } else if (jenisMotor.equalsIgnoreCase("Manual")) {
            return 220000;
        } else {
            return 200000;
        }
    }
}
