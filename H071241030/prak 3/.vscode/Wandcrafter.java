public class Wandcrafter {
    String nama;
    String spesialisasi;
    Wand tongkat;

    public Wandcrafter() {
        
    }

    public Wandcrafter(String nama, String spesialisasi, Wand tongkat) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.tongkat = tongkat;
    }
    
    public void identitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Elemen tongkat: " + tongkat.getElemen());
        System.out.println("kekuatan tongkat: " + tongkat.getkekuatan());
    }

    public void perbandinganTongkat(Wandcrafter lain) {
        if (this.tongkat.getkekuatan() > lain.tongkat.getkekuatan()) {
            System.out.println(this.nama + " memiliki kekuatan tongkat lebih kuat dibanding " + lain.nama);
        } else if (this.tongkat.getkekuatan() < lain.tongkat.getkekuatan()) {
            System.out.println(this.nama + " memiliki kekuatan tongkat kurang dibanding " + lain.nama);
        } else {
            System.out.println(this.nama + " memiliki kekautan yang sebanding dengan " + lain.nama);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public Wand getTongkat() {
        return tongkat;
    }

    public void setTongkat(Wand tongkat) {
        this.tongkat = tongkat;
    }
    

}
