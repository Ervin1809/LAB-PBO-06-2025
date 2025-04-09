package Praktikum2;

import java.util.Scanner;

public class Soal1 {
    public static class Person {
        String name;
        int age;
        boolean isMale;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setGender(String isMale) {
            if (isMale.equals("0")) {
                this.isMale = true;
            } else {
                this.isMale = false;
            }
            ;
        }

        public String getGender() {
            return isMale ? "Male" : "Female";
        }

        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);

            Person p = new Person();
            String nama = a.nextLine();
            p.setName(nama);
            int umur = a.nextInt();
            p.setAge(umur);
            a.nextLine();
            String laki = a.nextLine();
            p.setGender(laki);
            a.close();

            // p.setName("Budi");
            // p.setAge(20);
            // p.setGender(true);

            System.out.println("Name   : " + p.getName());
            System.out.println("Age    : " + p.getAge());
            System.out.println("Gender : " + p.getGender());
        }
    }
}