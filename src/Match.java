public class Match {
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;
    int roundCounter;
    int firstPunch;

    public Match(Boxer b1, Boxer b2, int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.roundCounter = 1;
        this.firstPunch = 50;
    }

    public void run() {

        if (checkWeight()) {
            System.out.println("The match begins...");
            printStatus();

            while (this.b1.health > 0 && this.b2.health > 0) {

                System.out.println("======= ROUND : " + roundCounter + " =======");

                if (firstPunch()) {
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }

                } else {
                    this.b1.health = this.b2.hit(this.b1);
                    if (isWin()) {
                        break;
                    }
                    this.b2.health = this.b1.hit(this.b2);
                    if (isWin()) {
                        break;
                    }
                }

                printStatus();
                roundCounter++;
            }
        } else {
            System.out.println("The weights of Boxers don't match! ");
        }

    }

    public boolean checkWeight() {

        return (this.b1.weight >= this.minWeight && this.b1.weight <= this.maxWeight) &&
                (this.b2.weight >= this.minWeight && this.b2.weight <= this.maxWeight);
    }

    public boolean isWin() {
        if (this.b1.health == 0) {
            printStatus();
            System.out.println("The winner: " + this.b2.name);
            return true;
        } else if (this.b2.health == 0) {
            printStatus();
            System.out.println("The winner: " + this.b1.name);
            return true;
        }
        return false;
    }

    public void printStatus() {
        System.out.println("---------------");
        System.out.println(this.b1.name + "'s health status: " + this.b1.health);
        System.out.println(this.b2.name + "'s health status: " + this.b2.health);
    }

    public boolean firstPunch() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.firstPunch;
    }


}
