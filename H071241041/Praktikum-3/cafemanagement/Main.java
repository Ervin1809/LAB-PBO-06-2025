// package cafemanagement;

// public class Main {
//     public static void main(String[] args) {
//         Cafe cafe = new Cafe("Cafe Ceria");

//         // Manajemen menu
//         cafe.addMenuItem("Nasi Goreng", 25000);
//         cafe.addMenuItem("Es Teh Manis", 8000);
//         cafe.showMenu();

//         // Reservasi online ruang
//         cafe.reserveRoomOnline("VIP", "Budi");
//         cafe.reserveRoomOnline("Anak-anak", "Sinta");

//         // Pemesanan antar
//         Delivery delivery = new Delivery("Ani", "Nasi Goreng", "Es Teh Manis", "Jl. Mawar No.12");
//         delivery.sendOrder();

//         // Hitung kembalian
//         cafe.calculateChange(50000, 33000); // contoh transaksi
//     }
// }

package cafemanagement;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("gb scientist");
        cafe.addMenuItem("nasi goreng", 25000);
        cafe.addMenuItem("es teh", 8000);
        cafe.showMenu();

        cafe.reserveRoomOnline("VIP", "pariddd");
        cafe.reserveRoomOnline("Anak-anak", "caca");

        cafe.calculateChange(50000, 33000);

        Delivery kurir1 = new Delivery("alan");
        Delivery kurir2 = new Delivery("iyad");

        if (!kurir1.hasTakenOrder() && !kurir2.hasTakenOrder()) {
            kurir1.takeOrder(); 
        } else if (!kurir2.hasTakenOrder()) {
            kurir2.takeOrder();
        }

        System.out.println();
        kurir1.checkStatus();
        kurir2.checkStatus();
    }
}
