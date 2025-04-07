class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }

    double getLuas(){
        return 2 * ((length * width) + (length * height) + (height * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.height = 10;
        cuboid.width = 15;
        cuboid.length = 30;

        System.out.printf("Volume = %.2f\n", cuboid.getVolume());
        System.out.printf("Luas = %.2f", cuboid.getLuas());
    }
}
