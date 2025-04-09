package Praktikum2;

class Produk {
    String id;
    String nama;
    int stok;
    int harga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Produk(String id, String nama, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public Produk() {

    }

    public boolean isTersedia() {
        return stok > 0;
    }

    public void cekProduk() {
        System.out.println("\nID Produk\t: " + id);
        System.out.println("Nama Produk\t: " + nama);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga\t\t: Rp." + harga);
        System.out.println("Status\t\t: " + (isTersedia() ? "Tersedia" : "Kosong"));
    }

}

public class Soal2 {
    public static void main(String[] args) {
        Produk produk3 = new Produk();
        produk3.setId("P003");
        produk3.setNama("Gula");
        produk3.setHarga(3000);
        produk3.setStok(5);
        produk3.cekProduk();
        Produk produk1 = new Produk("P001", "Kopi Susu", 10, 15000);
        produk1.cekProduk();

        Produk produk2 = new Produk("P002", "Teh Manis", 0, 8000);
        produk2.cekProduk();
    }
}
