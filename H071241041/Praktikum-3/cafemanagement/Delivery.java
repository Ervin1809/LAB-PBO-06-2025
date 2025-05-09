package cafemanagement;

public class Delivery {
    private String courierName;
    private boolean hasOrder;

    public Delivery(String courierName) {
        this.courierName = courierName;
        this.hasOrder = false;
    }

    // Kurir ambil order kalau belum ada yang ambil
    public void takeOrder() {
        if (!hasOrder) {
            this.hasOrder = true;
            System.out.println(courierName + " berhasil mengambil order.");
        } else {
            System.out.println(courierName + " sudah mengambil order sebelumnya.");
        }
    }

    public boolean hasTakenOrder() {
        return hasOrder;
    }

    public String getCourierName() {
        return courierName;
    }

    public void checkStatus() {
        String status = hasOrder ? "Sudah Ambil" : "Belum Ambil";
        String orderInfo = hasOrder ? "Nasi Goreng & Es Teh Manis" : "-";
        System.out.println("Status Kurir: " + courierName + " | Order: " + orderInfo + " | " + status);
    }
    
}
