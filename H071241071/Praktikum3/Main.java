// package TmpOopTP.TP3;

public class Main {
    public static void main(String[] args) {
        Senjata pedang = new Senjata("Pedang Kegelapan", 20, "Melee");
        Armor pelindung = new Armor("Pelindung Kegelapan", 30);

        Vampire vampire1 = new Vampire("Dracula", 100, pedang, pelindung);
        Vampire vampire2 = new Vampire("Vlad", 100, new Senjata("Tongkat Sihir", 15, "Dark Magic"),
                new Armor("Armor Gelap", 20));

        vampire1.info();
        vampire2.info();

        // vampire1.serang(vampire2);

        // vampire1.info();
        // vampire2.info();

        vampire2.serang(vampire1);

        vampire1.info();
        // vampire2.info();

    }
}
