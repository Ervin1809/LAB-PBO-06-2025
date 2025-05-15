public class Main {
    public static void main(String[] args) {
        Skateboard sk1 = new Skateboard("iyad", "cici", 150);
        Sepeda sp1 = new Sepeda("Polygon", "TDR 3000", 200);

        if (sk1.getKecepatan() == sp1.getKecepatan()){
            System.out.println("skateboard dan sepeda memiliki kecepatan yg sama");
        } else if (sk1.getKecepatan() >= sp1.getKecepatan()){
            System.out.println("skateboard lebih cepat dari sepeda");
        } else if (sk1.getKecepatan() <= sp1.getKecepatan()){
            System.out.println("sepeda lebih cepat dari skateboard");
        } else {
            System.out.println("tidak valid");
        }
    }
}