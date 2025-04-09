package No2;

public class Validasi {
    String id, nama;
    int stok, harga;

    String getStock(){
        return this.stok > 0 ? "Tersedia" : "Habis";
    }
    int getHarga(){
        return this.harga;
    }
    String getNama(){
        return this.nama;
    }
    String getId(){
        return this.id;
    }
    void getItem(){
        System.out.println("Barang :" + this.getNama());
        System.out.println("ID: " + this.getId());
        System.out.println("Harga :" + this.getHarga());
        System.out.println("Stok :" + this.getStock());
        // return "Barang : " + this.getNama() + "\nID : " + this.getId() +  "\nHarga : " + this.getHarga() + "\nStok : " + this.getStock();
    }
}
