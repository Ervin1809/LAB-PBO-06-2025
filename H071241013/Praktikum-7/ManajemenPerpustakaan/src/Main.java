import java.util.Scanner;

public class Main {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            tampilkanMenu();
            System.out.print("Pilih menu (1-8): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1" -> tambahItem();
                case "2" -> tambahAnggota();
                case "3" -> pinjamItem();
                case "4" -> kembalikanItem();
                case "5" -> System.out.println(library.getLibraryStatus());
                case "6" -> System.out.println(library.getAllLogs());
                case "7" -> lihatItemDipinjamAnggota();
                case "8" -> {
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem.");
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
    }

    private static void tampilkanMenu() {
        System.out.println("=== Sistem Manajemen Perpustakaan ===");
        System.out.println("1. Tambah Item");
        System.out.println("2. Tambah Anggota");
        System.out.println("3. Pinjam Item");
        System.out.println("4. Kembalikan Item");
        System.out.println("5. Lihat Status Perpustakaan");
        System.out.println("6. Lihat Log Aktivitas");
        System.out.println("7. Lihat Item yang Dipinjam Anggota");
        System.out.println("8. Keluar");
    }

    private static void tambahItem() {
        System.out.print("Jenis item (Buku/DVD): ");
        String jenis = scanner.nextLine().trim();

        System.out.print("Judul: ");
        String title = scanner.nextLine();

        System.out.print("ID Item: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (jenis.equalsIgnoreCase("Buku")) {
            System.out.print("Penulis: ");
            String author = scanner.nextLine();
            Book book = new Book(title, id, author);
            System.out.println(library.addItem(book));
        } else if (jenis.equalsIgnoreCase("DVD")) {
            System.out.print("Durasi (menit): ");
            int durasi = Integer.parseInt(scanner.nextLine());
            DVD dvd = new DVD(title, id, durasi);
            System.out.println(library.addItem(dvd));
        } else {
            System.out.println("Jenis item tidak dikenali.");
        }
    }

    private static void tambahAnggota() {
        System.out.print("Nama anggota: ");
        String nama = scanner.nextLine();
        System.out.print("ID anggota: ");
        int id = Integer.parseInt(scanner.nextLine());
        Member member = new Member(nama, id);
        library.addMember(member);
        System.out.println("Anggota berhasil ditambahkan.");
    }

    private static Member cariMember() {
        System.out.print("Masukkan ID anggota: ");
        int memberId = Integer.parseInt(scanner.nextLine());

        return library.getMembers().stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Anggota tidak ditemukan."));
    }

    private static void pinjamItem() {
        try {
            Member member = cariMember();
            System.out.print("Masukkan ID item yang ingin dipinjam: ");
            int itemId = Integer.parseInt(scanner.nextLine());
            LibraryItem item = library.findItemById(itemId);
            
            System.out.print("Jumlah hari peminjaman: ");
            int days = Integer.parseInt(scanner.nextLine());

            String result = member.borrow(item, days);
            library.getLogger().logActivity("[" + item.getTitle() + "] dipinjam oleh " + member.getName());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void kembalikanItem() {
        try {
            Member member = cariMember();
            System.out.print("Masukkan ID item yang ingin dikembalikan: ");
            int itemId = Integer.parseInt(scanner.nextLine());
            System.out.print("Jumlah hari keterlambatan: ");
            int lateDays = Integer.parseInt(scanner.nextLine());

            LibraryItem item = library.findItemById(itemId);
            String result = member.returnItem(item, lateDays);
            library.getLogger().logActivity("[" + item.getTitle() + "] dikembalikan oleh " + member.getName());
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void lihatItemDipinjamAnggota() {
        try {
            Member member = cariMember();
            member.getBorrowedItems();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
