public class Weapon {
    private String nama;
    private int damage;
    private String tipe;

    public Weapon(String nama, int damage, String tipe) {
        this.nama = nama;
        this.damage = damage;
        this.tipe = tipe;
    }

    public int getDamage() {
        return damage;
    }

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }
}
