package automobile;

public class CarsOverloading2 {
    // 2.	Data type of parameters are different

    public static void main(String[] args) {
        increaseSeatHeight(3);
        increaseSeatHeight("four");
    }
    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increase seat height by " + heightToIncrease + " inches - I am the integer one");
    }

    public static void increaseSeatHeight(String heightToIncrease) {
        System.out.println("Increase seat height by " + heightToIncrease + " inches - I am the string one");
    }
}
