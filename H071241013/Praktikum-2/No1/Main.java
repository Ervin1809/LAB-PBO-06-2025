package No1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = input.nextInt();
        input.nextLine();
        String gender = input.nextLine();

        biodata.setName(name);
        biodata.setAge(age);
        biodata.setGender(gender);

        input.close();
        System.out.println(biodata.getName());
        System.out.println(biodata.getAge());
        System.out.println(biodata.getGender());
    }
}
