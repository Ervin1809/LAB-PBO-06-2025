package kendaraan;

public abstract class Kendaraan implements IBergerak {
    String id;
    String merek;
    String model;
    int tahunProduksi;
    String warna;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    abstract double hitungPajak();
    abstract String getTipeKendaraan();
}