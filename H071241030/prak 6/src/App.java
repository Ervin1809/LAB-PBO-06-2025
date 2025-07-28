import kendaraan.KapalLawd;
import kendaraan.Kendaraan;
import kendaraan.Mobil;
import kendaraan.Motor;
import kendaraan.Sepeda;

public class App {
    public static void main(String[] args) throws Exception {
        Kendaraan mobil = new Mobil("toyota", null, 0, 0, 0, null, 100);
        Kendaraan motor = new Motor("yamaha", null, null, 0, null, 100);
        Kendaraan sepeda = new Sepeda("Polygon", "S12","Mountain Bike",7,16 );
        Kendaraan kapal = new KapalLawd("Fery", "s22","api",200 , 20, 150);

        if (mobil.getKecepatan() > motor.getKecepatan()) {
            System.out.println("mobil lebih cepat dibanding motor");
        } else if (mobil.getKecepatan() == motor.getKecepatan()) {
            System.out.println("kecepatan keduanya sama");
        }else {
            System.out.println("motor lebih cepat dibanding mobil");
        }

        System.out.println(sepeda.getKecepatan());
        kapal.mulai();
    }
}
