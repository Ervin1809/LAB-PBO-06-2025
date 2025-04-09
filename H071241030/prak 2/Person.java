public class Person {
    String name;
    int age;
    boolean isMale;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    void setGender(boolean isMale) {
        this.isMale = isMale;

    }

    String getGender() {
        return isMale ? "Laki-Laki" : "Perempuan";
    }

    public void display() {
        String isMale1;
        if (isMale) {
            isMale1 = "laki-laki";
        } else {
            isMale1 = "perempuan";
        }
        
        System.out.println("kelamin: " + isMale1);
        System.out.println("nama: " + name);
        System.out.println("umur: " + age);
        
    }
    public static void main(String[] args) {
        Person data = new Person();
        Person yusra = new Person();

        yusra.setName("yusra");
        yusra.setAge(18);
        yusra.setGender(true);
        
        data.setName("caca");
        data.setAge(18);
        data.setGender(false);

        System.out.println("nama: " + data.getName());
        System.out.println("umur: " + data.getAge());
        System.out.println("kelamin: " + data.getGender());
        yusra.display();
    }
    
    
}