package cafemanagement;

import java.util.HashMap;
import java.util.Map;

public class Cafe {
    String name;
    Room vipRoom;
    Room kidsRoom;
    Map<String, Integer> menu;

    public Cafe(String name) {
        this.name = name;
        this.vipRoom = new Room("VIP", 50000);
        this.kidsRoom = new Room("Anak-anak", 30000);
        this.menu = new HashMap<>();
    }

    public void addMenuItem(String item, int price) {
        menu.put(item, price);
    }

    public void showMenu() {
        System.out.println("Menu di " + name + ":");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            System.out.println("- " + entry.getKey() + " : Rp" + entry.getValue());
        }
    }

    public void reserveRoomOnline(String type, String customerName) {
        switch (type.toLowerCase()) {
            case "vip":
                vipRoom.book(customerName);
                break;
            case "anak-anak":
                kidsRoom.book(customerName);
                break;
            default:
                System.out.println("Jenis ruang tidak tersedia.");
        }
    }

    public void calculateChange(int uangDibayar, int totalHarga) {
        if (uangDibayar >= totalHarga) {
            int kembalian = uangDibayar - totalHarga;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang tidak cukup untuk membayar pesanan.");
        }
    }
}