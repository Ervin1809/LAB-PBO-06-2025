public class Pemanah extends Hero {
    public Pemanah(String nama, int health, int attackPower) {
        super(nama, health, attackPower);
    }
    @Override
    public  void Serang() {
        System.out.println(nama + " memanah dengan kekuatan " + attackPower + "!");
    }


}
