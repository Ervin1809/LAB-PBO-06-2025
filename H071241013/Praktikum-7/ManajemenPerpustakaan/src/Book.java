public class Book extends LibraryItem {
    private String author;
    private static final int MAX_BORROW_DAYS = 14;
    private static final double FINE_PER_DAY = 10000.0;

    // Constructor
    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    // Implementasi deskripsi
    @Override
    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }

    // Implementasi peminjaman
    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item sudah dipinjam dan belum dikembalikan.");
        }
        if (days > MAX_BORROW_DAYS) {
            throw new IllegalArgumentException("Buku hanya bisa dipinjam maksimal " + MAX_BORROW_DAYS + " hari.");
        }
        this.isBorrowed = true;
        return "Item " + title + " berhasil dipinjam selama " + days + " hari";
    }

    // Implementasi denda
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * FINE_PER_DAY;
    }
}