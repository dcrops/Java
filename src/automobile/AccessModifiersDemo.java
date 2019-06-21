package automobile;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.increaseSpeed();
        c1.speed = 10;
        c1.setPrivateSpeed(10);
        c1.publicSpeed = 25;
        c1.protectedSpeed = 40;
        c1.decreaseSpeed();
    }
}
