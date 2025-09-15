public class Penyihir extends Hero {
    public Penyihir(String nama, int health, int attackPower) {
        super(nama, health, attackPower);
    }
    @Override
    public void Serang() {
        System.out.println(nama + " menyihir dengan kekuatan " + attackPower + "!");
    }
}
