public class Book extends LibraryItem {
    String author;
    
    public Book(String title, int itemId, boolean isBorrowed, String author) {
        super(title, itemId, isBorrowed);
        this.author = author;
    }

    @Override
    String getDescription() {
        return "Buku: " + title + " oleh " + author + " ID: " + itemId;
    }

    @Override
    String borrowItem(int days) {
       if (isBorrowed)
            throw new IllegalArgumentException("buku sudah dipinjam.");
        if (days > 14)
            throw new IllegalArgumentException("Buku hanya bisa dipinjam maksimal 14 hari.");
        isBorrowed = true;
        return "buku" + title + " berhasil dipinjam selama " + days + " hari";
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 10000;
    }
}
