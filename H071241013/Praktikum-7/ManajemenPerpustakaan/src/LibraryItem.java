public abstract class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isBorrowed;
    
    public LibraryItem(){

    }
    // Constructor
    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = false; // default belum dipinjam
    }

    // Abstract method untuk deskripsi item
    public abstract String getDescription();

    // Abstract method untuk peminjaman item
    public abstract String borrowItem(int days);

    // Abstract method untuk menghitung denda
    public abstract double calculateFine(int daysLate);

    // Method untuk mengembalikan item
    public String returnItem() {
        this.isBorrowed = false;
        return title + " dikembalikan";
    }

    // Getter untuk status peminjaman
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Getter untuk title
    public String getTitle() {
        return title;
    }

    // Getter untuk itemId
    public int getItemId() {
        return itemId;
    }
}
