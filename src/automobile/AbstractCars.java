package automobile;

public abstract class AbstractCars {

    private int privateSpeed;
    public int publicSpeed;
    protected int protectedSpeed;

    public AbstractCars() {
        this(0);
    }

    public AbstractCars(int startspeed) {
        this.privateSpeed = startspeed;
    }

    public void setPrivateSpeed(int pSpeed) {
        this.privateSpeed = pSpeed;
    }

    public abstract void engineStart(String keyType, int NumOfCyl);



}
