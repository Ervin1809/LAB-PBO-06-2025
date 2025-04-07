public class Produk{
    private int id;
    private String nama;
    private int stok;
    private int harga;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public int getStok(){
        return stok;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return harga;
    }

    public String getAda() {
        if (stok > 0) {
            return "stok tersedia";
        } else if (stok == 0) {
            return "stok habis";
        } else { 
            return "stok tidak valid";
        }
    }
    public void display(){
        System.out.println("ID produk: " + id);
        System.out.println("nama produk: " + nama);
        System.out.println("stok produk: " + stok);
        System.out.println("harga produk: Rp. " + harga);
        System.out.println("ketersediaan produk: " + getAda() + ", stok yg tersedia: " + stok);
    }
    

    public static void main(String[] args) {
        Produk produk = new Produk();
        produk.setId(123);
        produk.setNama("sabun");
        produk.setStok(7);
        produk.setHarga(5000);

        System.out.println("ID produk: " + produk.getId());
        System.out.println("nama produk: " + produk.getNama());
        System.out.println("stok produk: " + produk.getStok());
        System.out.println("harga produk: Rp. " + produk.getHarga());
        System.out.println("ketersediaan produk: " + produk.getAda() + ", stok yg tersedia: " + produk.getStok());
        produk.display();
    }
}