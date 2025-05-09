public class Skateboard extends Kendaraan implements IBergerak {
    double panjangPapan;
    double kecepatan;

    public Skateboard(String merek, String model, double kecepatan) {
        super(merek, model);
        this.kecepatan = kecepatan;
    }

    public void setPanjangPapan(double panjang) {
        this.panjangPapan = panjang;
    }

    public double getPanjangPapan() {
        return panjangPapan;
    }

    public double hitungPajak() {
        return 0;
    }

    public String getTipeKendaraan() {
        return "Skateboard";
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
}
