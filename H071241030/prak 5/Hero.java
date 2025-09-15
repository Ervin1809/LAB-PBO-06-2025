public class Hero {
    static int tabungan;
    String nama;
    int health;
    int attackPower;
    
    public Hero(){

    }
    
    public Hero(String nama, int health, int attackPower) {
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void Serang() {
        System.out.println(nama + " menyerang dengan kekuatan " + attackPower + "!");
    }

    
}
