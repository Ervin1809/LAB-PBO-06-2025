// package TmpOopTP.TP3;

public class Vampire {
    String nama;
    int darah;
    Senjata senjata;
    Armor armor;

    public Vampire() {
    }

    public Vampire(String nama, int darah, Senjata senjata, Armor armor) {
        this.nama = nama;
        this.darah = darah;
        this.senjata = senjata;
        this.armor = armor;
    }

    public void serang(Vampire musuh) {
        int damage = this.senjata.getKekuatan();
        int pengurangan = (int) (0.2 * musuh.armor.getPertahanan());
        int totalDamage = damage - pengurangan;
        musuh.darah -= totalDamage;
        System.out.println(this.nama + " menyerang " + musuh.nama + " dengan " + damage + " damage!");
        System.out.println("Armor mengurangi damage sebesar: " + pengurangan);
        System.out.println(musuh.nama + " sekarang memiliki " + musuh.darah + " darah tersisa.\n");
    }

    public void info() {
        System.out.printf("=========== %s Status ===========\n", nama);
        System.out.println("Nama: " + nama);
        System.out.println("Darah: " + darah);
        senjata.tampilkanInfoSenjata();
        armor.tampilkanInfoArmor();
        System.out.println("=====================================");
        System.out.println();
    }
}
