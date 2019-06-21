package automobile;



public class BMW extends Cars {

    @Override
    public void increaseSpeed() {
        protectedSpeed++;
        System.out.println("Increasing speed of BMW");
    }

 public void headsupDisplayNavigation() {
     System.out.println("BMW specific functionality");
 }

    public BMW(int startspeed) {
        super(startspeed);
    }
}
