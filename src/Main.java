public class Main {
    public static void main(String[] args) {
        Boxer b1 = new Boxer("Muhammed Ali",30,200,85,50);
        Boxer b2 = new Boxer("George Foreman",20,180,90,60);

        Match match = new Match(b1,b2,85,90);
        match.run();
    }
}
