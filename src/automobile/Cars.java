package automobile;

public class Cars {
    int speed;
    private int privateSpeed;
    int speedLimit;
    protected int speedP;
    public int publicSpeed;
    protected int protectedSpeed;

    public Cars() {
    this(0);
    }

    public void setPrivateSpeed(int pSpeed) {
        privateSpeed = pSpeed;
    }

    public Cars(int startspeed) {
        speed = startspeed;
    }

    public void increaseSpeed() {
        if (speed < 100) {
            speed++;
        }
    }

    protected void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing Speed of Cars");
    }

}
