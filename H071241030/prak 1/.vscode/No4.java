import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close(); 
        
        if (a < 0) {
            System.out.println("masukkan bilangan positif");
        } else {
            System.out.println(faktorial(a));
        }
    }
    
    public static int faktorial(int a) {
            if (a == 0 || a == 1) {
                return 1;
            }
            return a * faktorial(a - 1);
    }
}


    
