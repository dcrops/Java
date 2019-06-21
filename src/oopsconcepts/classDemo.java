package oopsconcepts;

public class classDemo {
    public static void main(String[] args) {
        Car bmw = new Car(); //Create and initialise the object
        bmw.setMake("BMW");
        System.out.println("Make of BWM is " + bmw.getMake());

        Car benz = new Car();
        benz.setMake("BENZ");
        System.out.println("Make of Benz is " + benz.getMake());

        benz.setModel("c300");
        System.out.println("Model of Benz is " + benz.getModel());
        benz.setYear(1980);
        System.out.println("Year of Benz is " + benz.getYear());
        benz.setYear(1880);
        System.out.println("Alternate Year of Benz is " + benz.getYear());
    }
}
