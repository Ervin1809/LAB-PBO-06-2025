public class Skateboard extends Kendaraan implements IBergerak {
    private double kecepatan;

    public Skateboard(String merek, String model) {
        super(merek, model);
    }

    @Override
    public boolean mulai() {
        System.out.println("Skateboard mulai meluncur.");
        return true;
    }

    @Override
    public boolean berhenti() {
        System.out.println("Skateboard berhenti.");
        return true;
    }

    @Override
    public double getKecepatan() { 
        return kecepatan; }

    @Override
    public void setKecepatan(double kecepatan) { 
        this.kecepatan = kecepatan; }

    @Override
    public double hitungPajak() { 
        return 0; }

    @Override
    public String getTipeKendaraan() { 
        return "Skateboard"; }
}