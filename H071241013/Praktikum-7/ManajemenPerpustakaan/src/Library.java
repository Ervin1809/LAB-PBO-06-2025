import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;

    // Constructor
    public Library() {
        this.items = new ArrayList<>();
        this.members = new ArrayList<>();
        this.logger = new LibraryLogger();
    }

    // Menambahkan item ke perpustakaan
    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    // Menambahkan member ke perpustakaan
    public void addMember(Member member) {
        members.add(member);
    }

    // Mencari item berdasarkan ID
    public LibraryItem findItemById(int itemId) {
        return items.stream()
                .filter(item -> item.getItemId() == itemId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item dengan ID " + itemId + " tidak ditemukan."));
    }

    // Menampilkan status perpustakaan dalam format tabel ASCII
    public String getLibraryStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("+------+----------------------+-----------+\n");
        sb.append("| ID   | Judul               | Status    |\n");
        sb.append("+------+----------------------+-----------+\n");

        for (LibraryItem item : items) {
            String idStr = String.format("%-4d", item.getItemId());
            String titleStr = String.format("%-20s", item.getTitle());
            String status = item.isBorrowed() ? "Dipinjam" : "Tersedia";
            sb.append(String.format("| %-4s | %-20s | %-9s |\n", idStr, titleStr, status));
        }

        sb.append("+------+----------------------+-----------+");
        return sb.toString();
    }

    // Mendapatkan semua log dari logger
    public String getAllLogs() {
        return logger.getLogs();
    }

    // Akses ke logger
    public LibraryLogger getLogger() {
        return logger;
    }

    // Getter opsional
    public List<LibraryItem> getItems() {
        return items;
    }

    public List<Member> getMembers() {
        return members;
    }
}
