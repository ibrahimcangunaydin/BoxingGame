public class Boxer {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Boxer(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Boxer boxer) {

        if (boxer.dodge()) {
            System.out.println(boxer.name + " dodged the punch");
            return boxer.health;
        } else if (boxer.health > 0) {
            System.out.println(this.name + " did " + this.damage + " damage to " + boxer.name);
            if (boxer.health - this.damage > 0) {
                return boxer.health - this.damage;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
