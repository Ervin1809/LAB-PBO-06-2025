public class JackTheRipper {
    private String nama;
    private int jumlahKorban;
    private int damage;
    private int health;
    private Weapon senjata;

    public JackTheRipper() {;
    }

    public JackTheRipper(String nama, int jumlahKorban, int damage, int health, Weapon senjata) {
        this.nama = nama;
        this.jumlahKorban = jumlahKorban;
        this.damage = damage;
        this.health = health;
        this.senjata = senjata;
    }

    public int getTotalDamage() {
        return damage + (senjata != null ? senjata.getDamage() : 0);
    }

    public void serang(Korban korban) {
        if (korban == null) {
            System.out.println("Korban tidak valid!");
            return;
        }
        int totalDamage = getTotalDamage(); 
        System.out.println(nama + " menyerang " + korban.getNama() + " dengan " +
                (senjata != null ? senjata.getNama() : "tangan kosong") +
                " sebesar " + totalDamage + " damage!");
        korban.terluka(this); 
        jumlahKorban++;
    }

    public void serang(JackTheRipper musuh) {
        if (musuh == null) {
            System.out.println("Musuh tidak valid!");
            return;
        }
        int totalDamage = getTotalDamage(); 
        System.out.println(nama + " menyerang " + musuh.getNama() + " dengan " +
                (senjata != null ? senjata.getNama() : "tangan kosong") +
                " sebesar " + totalDamage + " damage!");
        musuh.terluka(totalDamage); 
    }

    public void terluka(int damage) {
        System.out.println(nama + " terkena serangan dengan damage " + damage + "!");
        health -= damage;

        if (health <= 0) {
            health = 0;
            System.out.println(nama + " telah mati!");
        } else {
            System.out.println(nama + " masih hidup. Sisa health: " + health);
        }
    }

    public void duel(JackTheRipper musuh) {
        if (musuh == null) {
            System.out.println("Musuh tidak valid!");
            return;
        }
        System.out.println(nama + " menantang " + musuh.getNama() + " dalam duel!");

        while (this.health > 0 && musuh.getHealth() > 0) {
            this.serang(musuh);
            if (musuh.getHealth() > 0) {
                musuh.serang(this);
            }
        }

        if (this.health > 0) {
            System.out.println(nama + " memenangkan duel!");
        } else if (musuh.getHealth() > 0) {
            System.out.println(musuh.getNama() + " memenangkan duel!");
        } else {
            System.out.println("Duel berakhir seri!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKorban() {
        return jumlahKorban;
    }

    public void setJumlahKorban(int jumlahKorban) {
        this.jumlahKorban = jumlahKorban;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getSenjata() {
        return senjata;
    }

    public void setSenjata(Weapon senjata) {
        this.senjata = senjata;
    }
}
