package automobile;

public class CarsOverloading1 {
    //1. Different number of parameters in argument list

    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(3, true);

    }

    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increase seat height by " + heightToIncrease + " inches");
    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
        System.out.println("Increase seat height by " + heightToIncrease + " inches");
        if (rememberHeight) {
            System.out.println("Your selection is saved");
        } else {
            System.out.println("Your selection is not saved");
        }
    }
}
