package collectionsframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "BMW");
        hashmap.put(6, "Audi");
        hashmap.put(4, "Honda");

        System.out.println("Iteration 1");
        for (Map.Entry<Integer, String> entry: hashmap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("\nIteration 2");
        for (Integer key: hashmap.keySet()) {
            String value = hashmap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        //Maintain order in which they are added
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "Volvo");
        linkedMap.put(6, "VW");
        linkedMap.put(4, "Toyota");
        System.out.println("Iteration 3");
        for (Map.Entry<Integer, String> entry: linkedMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("\nIteration 4");
        for (Integer key: linkedMap.keySet()) {
            String value = linkedMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }

        //Maintains natural sorting order
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Merc");
        treeMap.put(6, "Jaguar");
        treeMap.put(4, "Hyundai");
        System.out.println("Iteration 5");
        for (Map.Entry<Integer, String> entry: treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
        System.out.println("\nIteration 6");
        for (Integer key: treeMap.keySet()) {
            String value = treeMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
