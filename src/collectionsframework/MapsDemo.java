package collectionsframework;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        //Stores the elements in pairs. Key --> Value : Entry
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(4, "Honda");

        //Keys are always unique but values can be duplicated
        String value1 = map.get(6);
        System.out.println(value1);

        map.put(2, "BMW");
        String value2 = map.get(2);
        System.out.println(value2);

        map.put(2, "Benz");
        String value3 = map.get(2);
        System.out.println(value3);
    }
}
