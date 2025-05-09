// package TmpOopTP.TP3;

public class Armor {
    String namaArmor;
    int pertahanan;

    public Armor() {
        this.namaArmor = "Tanpa Armor";
        this.pertahanan = 0;
    }

    public Armor(String namaArmor, int pertahanan) {
        this.namaArmor = namaArmor;
        this.pertahanan = pertahanan;
    }

    public void tampilkanInfoArmor() {
        System.out.println("Nama Armor: " + namaArmor);
        System.out.println("Pertahanan: " + pertahanan);
    }

    public int getPertahanan() {
        return pertahanan;
    }
}
