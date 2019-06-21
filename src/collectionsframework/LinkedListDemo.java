package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
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

        //
        //Array List - {0, 1, 2, 3 4, 5, 6}
        //Linked List - [0] > [1] > [2] > [3]
        //                  <     <     <
        //Array List - when you have to add at the end and remove from the end and getting is fast
        //Linked List - When you have to add at the beginning and remove from the beginning

        List<Integer> lList = new LinkedList<>();
        List<Integer> aList = new ArrayList<>();

        runDuration(aList, "Array List");
        runDuration(lList, "Linked List");
    }

    public static void runDuration(List<Integer> list, String listType) {
        System.out.println("\nBeginning of the duration method for " + listType);
        for (int i = 0;i<200000;i++) {
            list.add(i);
        }
        int size = list.size();
        int elementToAdd = size + 100000;
        long startTime = System.currentTimeMillis();
        /*for (int i = size;i<elementToAdd;i++) {
            //list.add(i);
            list.add(0,i);
        }*/

        /*for (int i = 90000; i<92000;i++) {
            list.remove(i);
        }*/

        for (int i = 0; i<10000;i++) {
            list.remove(i);
        }

        long endTime = System.currentTimeMillis();
        long duration =  endTime - startTime;
        System.out.println("Duration of the list " + listType + " is: " + duration + "ms");

    }
}


