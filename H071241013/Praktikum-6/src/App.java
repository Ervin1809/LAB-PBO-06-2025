

public class App {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(20, "Avanza", "1");
        Motor motor1 = new Motor(20, "Honda", "1");

        if (mobil1.getKecepatan() > motor1.getKecepatan()) {
            System.out.println("Mobil lebih cepat");
        } else if(motor1.getKecepatan() > mobil1.getKecepatan()) {
            System.out.println("Motor lebih cepat");
        } else {
            System.out.println("Kecepatan sama");
        }

    }
}