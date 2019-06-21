package automobile;

public class CarsOverloading3 {
    //3.	The sequence of data type is different

    public static void main(String[] args) {
        increaseSeatHeight(3, "seven");
        increaseSeatHeight("Five", 6);
        
    }

    public static void increaseSeatHeight(int variable1, String variable2) {
        System.out.println("I am the the first overload");
    }

    public static void increaseSeatHeight(String variable2, int variable1) {
        System.out.println("I am the the second overload");
    }
}
