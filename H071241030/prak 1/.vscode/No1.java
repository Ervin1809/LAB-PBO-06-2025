import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan judul film: ");
        String[] judul = input.nextLine().split(" ");

        for (int i = 0; i < judul.length; i++) {
            if (judul[i].length() > 0) {
                judul[i] = Character.toUpperCase(judul[i].charAt(0)) + judul[i].substring(1);
            }
        }
        System.out.println(String.join(" ",judul));
        input.close();

    }
    
}