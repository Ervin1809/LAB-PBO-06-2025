

public class Detective {
    private String nama;
    private int pengalaman;
    private Lokasi lokasiInvestigasi;

    public Detective() {
    }

    public Detective(String nama, int pengalaman, Lokasi lokasiInvestigasi) {
        this.nama = nama;
        this.pengalaman = pengalaman;
        this.lokasiInvestigasi = lokasiInvestigasi;
    }

    public void selidiki() {
        System.out.println(this.nama + " sedang menyelidiki kasus di " + lokasiInvestigasi.getNama());
        // detective.lokasiInvestigasi.info();
    }

    public void aduStrategi(Detective detektifLain) {
        if (this.pengalaman > detektifLain.getPengalaman()) {
            System.out.println(nama + " lebih berpengalaman dalam penyelidikan!");
        } else if (this.pengalaman < detektifLain.getPengalaman()) {
            System.out.println(detektifLain.getNama() + " lebih berpengalaman dalam penyelidikan!");
        } else {
            System.out.println("Pengalaman penyelidikan keduanya setara!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    public Lokasi getLokasiInvestigasi() {
        return lokasiInvestigasi;
    }

    public void setLokasiInvestigasi(Lokasi lokasiInvestigasi) {
        this.lokasiInvestigasi = lokasiInvestigasi;
    }
}
