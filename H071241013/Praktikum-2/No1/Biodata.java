package No1;

public class Biodata {
    String name;       
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setGender(String isMale) {
        if (isMale.equals("Laki-laki")){
            this.isMale = true;
        }else {
            this.isMale = false;
        }
    } 
    String getGender(){
        if (this.isMale) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
}
