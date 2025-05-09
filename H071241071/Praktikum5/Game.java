package TP5;
import javax.swing.
import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public Hero(){
        System.out.println("Hero berhasil dibuat.");
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Archer extends Hero {
    public Archer() {
        super("Pemanah", 100, 15);
    }
    public void display(){
        System.out.println("Cek");
    }
}

class Wizard extends Hero {
    public Wizard() {
        super("Penyihir", 100, 20);
    }
    public void display(){
        System.out.println("Cek");
    }
}

class Fighter extends Hero {
    public Fighter() {
        this("Petarung", 100, 18);
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    public void display(){
        System.out.println("Cek");
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = null;

        while (true) {
            System.out.println("Pilih karakter:");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    hero = new Archer();
                    break;
                case 2:
                    hero = new Wizard();
                    break;
                case 3:
                    hero = new Fighter();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    continue;
            }

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Serang");
                System.out.println("2. Keluar");
                System.out.print("Pilihan aksi: ");
                int aksi = scanner.nextInt();

                if (aksi == 1) {
                    hero.attack();
                } else if (aksi == 2) {
                    System.out.println("Game selesai!");
                    scanner.close();
                    return;
                } else {
                    System.out.println("Pilihan tidak valid. Kembali ke menu aksi.");
                }
                System.out.println();
            }
        }
    }
}