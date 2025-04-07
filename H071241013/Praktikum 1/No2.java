import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        // Random random = new Random();

        for(int baris = 0; baris < nums.length; baris++){
            for(int kolom = 0; kolom < nums[baris].length; kolom++){
                // nums[baris][kolom]= random.nextInt(10);
                System.out.print(nums[baris][kolom] + " ");
            }System.out.println();
        }
        
            try {
                int angka = x.nextInt();
                boolean found = false;
            for (int baris = 0 ; baris < nums.length; baris++){
                for (int kolom= 0 ; kolom < nums[baris].length; kolom++){
                    if ( nums[baris][kolom] == angka ){
                        System.out.println("Founds "+ angka + " at " + "["+baris+"]" + "["+kolom+"]");
                        found = true;
                    }
                }
            }
            
            if(!found){
                System.out.println("nd ada ");
            }
            
        } catch (Exception e) {
            System.out.println("Inputan harus angkaa"+ e.getMessage());
            
        } finally{
            x.close();
}

}
}