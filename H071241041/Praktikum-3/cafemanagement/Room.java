package cafemanagement;

public class Room {
    String type;
    double price;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public void book(String customerName) {
        System.out.println(customerName + " telah memesan ruang " + type + 
            " dengan harga Rp" + price);
    }
}

