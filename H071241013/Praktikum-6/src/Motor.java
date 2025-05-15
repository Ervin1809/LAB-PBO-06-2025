import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisMotor;
    private double kapasitasTangki;
    private String tipeSuspensi;
    private double kecepatan;

    // public Motor(double kecepatan){
    //     super(kecepatan);
    // }

    public Motor(double kecepatan, String merek, String model) {
        super(merek, model);
        this.kecepatan = kecepatan;
    }

    public String getJenisMotor() { 
        return jenisMotor; }

    public void setJenisMotor(String jenis) { 
        this.jenisMotor = jenis; }

    public double getKapasitasTangki() { 
        return kapasitasTangki; }

    public void setKapasitasTangki(double kapasitas) { 
        this.kapasitasTangki = kapasitas; }

    public String getTipeSuspensi() { 
        return tipeSuspensi; }

    public void setTipeSuspensi(String tipe) { 
        this.tipeSuspensi = tipe; }

    @Override
    public boolean mulai() {
        System.out.println("Motor dinyalakan.");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Motor berhenti.");
        return true;
    }

    @Override
    public double getKecepatan() { 
        return kecepatan; }

    @Override
    public void setKecepatan(double kecepatan) { 
        this.kecepatan = kecepatan; }

    @Override
    public boolean periksaKondisi() { 
        return true; }

    @Override
    public void lakukanServis() { 
        System.out.println("Motor diservis."); }

    
    public Date getWaktuServisBerikutnya() { 
        return new Date(); }

    @Override
    public double hitungBiayaServis() { 
        return 300000; }

    @Override
    public double hitungPajak() { 
        return 500000; }

    @Override
    public String getTipeKendaraan() { 
        return "Motor"; }
}
