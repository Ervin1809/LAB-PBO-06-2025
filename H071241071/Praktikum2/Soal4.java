package Praktikum2;

class Alamat {
    String jalan;
    String kota;

    public String fullAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.fullAlamat();
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Paccerakkang";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Muhammad Fadel Aryasatya Makkulau";
        mahasiswa.nim = "H071241071";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}