public class Person {
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public String getGender(){
        if (isMale){
            return "male";
        }else{
            return "female";
        }
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "caca";
        person1.age = 18;
        person1.isMale = false;

        System.out.println("nama: " + person1.name);
        System.out.println("umur: " + person1.age);
        System.out.println("gender: " + person1.isMale);

        Person person = new Person();
        person.setName("john");
        person.setAge(25);
        person.setGender(true);

        System.out.println("nama: " + person.getName());
        System.out.println("umur: " + person.getAge());
        System.out.println("gender: " + person.getGender());
    }
}