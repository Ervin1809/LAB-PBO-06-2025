import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] nums = {{1,2,3} , {4,5,6}, {7,8,9}};

        
        try {
            int a = input.nextInt();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == a) {
                        System.out.println("found " + a + " at " + "[" + i + "]" +  "[" + j + "]" );
                        return;
                    }
                }
            }  
            System.out.println(a + " tidak ditemukan");
        } catch (Exception e) {
            System.out.println("masukkan angka");
        } finally {
            input.close();
        }
            
        

    }
}