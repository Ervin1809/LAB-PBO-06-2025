class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return length * width * height;
    }

    
}

public class No3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.height = 16.51;
        cuboid.length = 16.51;
        cuboid.width = 16.51;

        System.out.printf("volume: %.2f ", cuboid.getVolume());
    }

    
}  