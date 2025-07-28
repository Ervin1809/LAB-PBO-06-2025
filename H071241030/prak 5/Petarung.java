public class Petarung extends Hero{
    public Petarung(String nama, int health, int attackPower) {
        super(nama, health, attackPower);
    }
    @Override
    public void Serang() {
        System.out.println(this.nama + " menyerang dengan kekuatan " + this.attackPower + "!");
    }
}
