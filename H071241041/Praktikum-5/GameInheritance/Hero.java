class Hero {
    String name;
    int health;
    int attackPower;

    Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Hero(){
    //     System.out.println("hero sdh dibuat");
    // }

    void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}
