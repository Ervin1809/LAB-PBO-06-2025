import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan password: ");
        String pass = input.nextLine();

        input.close();

        int panjang = pass.length();
        int upper = 0, lower = 0, angka = 0;

        if (panjang < 8) {
            System.out.println("password tidak valid!");
            return;
        }

        for (int i = 0; i < panjang; i++) {
            char a = pass.charAt(i);
            if (Character.isUpperCase(a)) upper++;
            else if (Character.isLowerCase(a)) lower++;
            else if (Character.isDigit(a)) angka++;
        }
        
        if (upper > 0 && lower > 0 && angka > 0) {
            System.out.println("password valid!");
        } else {
            System.out.println("password tidak valid!");
        }
    }
}

