public class Wand {
    String elemen;
    int kekuatan;
    
    public Wand() {
       
    }
    
    public Wand(String elemen, int kekuatan) {
        this.elemen = elemen; 
        this.kekuatan = kekuatan;
    }
    
    public void display() {
        System.out.println("elemen: " + elemen + "\n" + "kekuatan: " + kekuatan);
    }
    
    public int getkekuatan() {
        return kekuatan;
    }
    
    public void setNamaWand(int kekuatan) {
        this.kekuatan = kekuatan;
    }
    
    public String getElemen() {
        return elemen;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }

}
