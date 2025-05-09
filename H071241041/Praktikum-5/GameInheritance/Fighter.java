class Fighter extends Hero {
    // Fighter(String name, int health, int attackPower) {
    //     this.name = name;
    //     this.health = health;
    //     this.attackPower = attackPower;
    // } 

    Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower); 
    }

    @Override
    void attack() {
        System.out.println(name + " memukul musuh dengan kekuatan " + attackPower + "!");
    }
}
