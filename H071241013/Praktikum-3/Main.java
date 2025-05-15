public class Main {
    public static void main(String[] args) {
        Lokasi lokasi1 = new Lokasi("Lab", 8, "Tempat paling berbahaya di PBT");
        Lokasi lokasi2 = new Lokasi("PBT", 4, "Tempat gelap dan misterius");

        Weapon pisau = new Weapon("Pisau Tumpul", 30, "Pisau");
        Weapon bambu = new Weapon("Bambu Runcing", 20, "Bambu");

        JackTheRipper jack1 = new JackTheRipper("Iyad", 0, 25, 100, pisau);
        JackTheRipper jack2 = new JackTheRipper("Arlis", 0, 20, 100, bambu);

        Korban korban1 = new Korban("Yayat", "hidup", lokasi1);
        Korban korban2 = new Korban("Farid", "hidup", lokasi2);

        Detective detective1 = new Detective("Detektif Erul", 8, lokasi1);
        Detective detective2 = new Detective("Detektif Conan", 6, lokasi2);

        System.out.println("=== Simulasi Pembunuhan ===");
        jack1.serang(korban1);
        jack2.serang(korban2);

        System.out.println("\n=== Duel ===");
        jack1.duel(jack2);
        
        detective1.selidiki();
        detective2.selidiki();

        System.out.println("\nStatus Korban 1: " + korban1.getNama() + " - " + korban1.getStatus());
        System.out.println("Status Korban 2: " + korban2.getNama() + " - " + korban2.getStatus());

        System.out.println("\nStatus JackTheRipper 1: " + jack1.getNama() + " - Health: " + jack1.getHealth());
        System.out.println("Status JackTheRipper 2: " + jack2.getNama() + " - Health: " + jack2.getHealth());
    }
}
