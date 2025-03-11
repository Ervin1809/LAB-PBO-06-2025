// package praktikum1;
import java.util.Scanner;
import java.util.regex.Pattern;
public class lat5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        String pattern = "^(?=.*\\w)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        if (Pattern.matches(pattern, password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }
        input.close();
    }
}

