public class Produk {
    String nama;
    int id;
    int stok;
    int harga;

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    boolean isTersedia() {
        return stok > 0;
    }

    public String status() {
        return isTersedia() ? "PRODUK TERSEDIA" : "PRODUK TIDAK TERSEDIA";
    }

    public static void main(String[] args) {
        Produk info = new Produk();

        info.setNama("Nissin Wallens Soes");
        info.setId(1234);
        info.setHarga(15000);
        info.setStok(3);

        System.out.println("Nama: " + info.getNama());
        System.out.println("ID: " + info.getId());
        System.out.printf("Harga: Rp.%,d\n", info.getHarga());
        System.out.println("Stok: " + info.getStok());
        System.out.println(info.status());
    }
}
