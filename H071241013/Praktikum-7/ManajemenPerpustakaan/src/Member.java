import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<LibraryItem> borrowedItems;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    // Meminjam item
    public String borrow(LibraryItem item, int days) {
        if (item.isBorrowed()) {
            throw new IllegalStateException("Item sudah dipinjam dan belum dikembalikan.");
        }

        String result = item.borrowItem(days);
        borrowedItems.add(item);
        return result;
    }

    // Mengembalikan item
    public String returnItem(LibraryItem item, int daysLate) {
        if (!borrowedItems.contains(item)) {
            throw new IllegalArgumentException("Item ini tidak sedang dipinjam oleh member ini.");
        }

        String returnMessage = item.returnItem();
        borrowedItems.remove(item);
        double fine = item.calculateFine(daysLate);

        return "Item " + item.getTitle() + " berhasil dikembalikan dengan denda: Rp " +
                String.format("%,.0f", fine);
    }

    // Menampilkan daftar item yang dipinjam (dengan format tabel ASCII)
    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam.");
        } else {
            System.out.println("+------+----------------------+");
            System.out.println("| ID   | Judul               |");
            System.out.println("+------+----------------------+");

            for (LibraryItem item : borrowedItems) {
                String idStr = String.format("%-4d", item.getItemId());
                String titleStr = String.format("%-20s", item.getTitle());
                System.out.println("| " + idStr + " | " + titleStr + " |");
            }

            System.out.println("+------+----------------------+");
        }
    }

    // Getter opsional
    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}