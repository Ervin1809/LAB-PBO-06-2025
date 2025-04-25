package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            // Mengecek apakah user index ke i dari listUser memiliki username yang sama
            // dengan username yang diinput.
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            // Mengecek apakah password dari User yang login berdasarkan username
            // sama dengan password yang diinput sebelumnya
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                // Panggil method showDetailUser dan kirimkan data Profile User yang login
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username tidak ditemukan");
        }
        runApp();
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Validasi agar username tidak duplikat
        String username;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();

            boolean isUsernameTaken = false;
            for (User user : listUser) {
                if (user.getUsername().equals(username)) {
                    isUsernameTaken = true;
                    break;
                }
            }

            if (isUsernameTaken) {
                System.out.println("Username sudah digunakan, silakan coba username lain.");
            } else {
                break;
            }
        }

        // Validasi agar password minimal 8 karakter
        String password;
        while (true) {
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();

            if (password.length() < 8) {
                System.out.println("Password terlalu pendek. Harus minimal 8 karakter.");
            } else {
                break;
            }
        }

        // Instance objek User baru, dan tambahkan username dan password
        User user = new User(username, password);

        // Instance objek Profile baru
        Profile profile = new Profile();

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        // Berikan nilai fullName, age, dan hobby ke objek profile
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);

        // Berikan nilai nickName ke objek profile menggunakan StringUtils
        profile.setNickName(StringUtils.generateNickName(fullName));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        // Tampilkan semua data profile user yang login
        System.out.println("-------------------------");
        System.out.println("Detail User");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nickname: " + profile.getNickName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("-------------------------");
    }
}