public class Lokasi {
    private String nama;
    private int bahaya;
    private String deskripsi;

    public Lokasi() {
    }

    public Lokasi(String nama, int bahaya, String deskripsi) {
        this.nama = nama;
        this.bahaya = bahaya;
        this.deskripsi = deskripsi;
    }

    public void ubahBahaya(int nilai) {
        this.bahaya = nilai;
        System.out.println("Level bahaya di " + nama + " diubah menjadi " + bahaya);
    }

    public void info() {
        System.out.println("Nama Lokasi  : " + nama);
        System.out.println("Level Bahaya : " + bahaya);
        System.out.println("Deskripsi    : " + deskripsi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBahaya() {
        return bahaya;
    }

    public void setBahaya(int bahaya) {
        this.bahaya = bahaya;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
