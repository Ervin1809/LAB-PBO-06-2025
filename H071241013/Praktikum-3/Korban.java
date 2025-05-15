public class Korban {
    private String nama;
    private String status;
    private int health;
    private Lokasi lokasi;

    public Korban() {
    }

    public Korban(String nama, String status, Lokasi lokasi) {
        this.nama = nama;
        this.status = status;
        this.health = 50;
        this.lokasi = lokasi;
    }

    public void terluka(JackTheRipper penyerang) {
        if (penyerang == null) {
            System.out.println("Penyerang tidak valid!");
            return;
        }

        int damage = penyerang.getTotalDamage();
        System.out.println(nama + " terkena serangan dari " + penyerang.getNama() + " dengan damage " + damage + "!");
        health -= damage;

        if (health <= 0) {
            health = 0;
            status = "mati";
            System.out.println(nama + " telah mati.");
        } else if (health < 50) {
            status = "terluka";
            System.out.println(nama + " terluka parah. Sisa health: " + health);
        } else {
            status = "hidup";
            System.out.println(nama + " masih hidup. Sisa health: " + health);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
}
