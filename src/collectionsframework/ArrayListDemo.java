package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //Adding
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Audi");

        //Size
        int size = cars.size();
        System.out.println("The size of the list is " + size);

        //Get
        System.out.println("The item of index 1 is " + cars.get(1));

        //Iteration
        System.out.println("Iteration Example");
        for (int i = 0;i < cars.size();i++) {
            System.out.println("Car " + i + " is: " + cars.get(i));
        }

        System.out.println("\nThe next For loop example");
        for (String car : cars) {
            System.out.println("The item is: " + car);
        }

        //Remove
        //cars.remove(1);
        cars.remove(size-1);
        System.out.println("\nThe next For loop example after removing");
        for (String car : cars) {
            System.out.println("The item is: " + car);
        }
    }
}
