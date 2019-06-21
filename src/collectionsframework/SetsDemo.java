package collectionsframework;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {
        //Hashset - Does not maintain any order
        Set<String> set = new HashSet<>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");
        System.out.println(set);

        for (String item: set) {
            System.out.println(item);
        }


        //LinkedHashSet - It maintains the order in which the elements are added.
        Set<String> lHSet = new LinkedHashSet<>();

        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        lHSet.add("Honda");
        System.out.println(lHSet);

        //Treeset - It maintains the natural sorting 1, 2, 3....alphabetical
        Set<String> tSet = new TreeSet<>();

        tSet.add("BMW");
        tSet.add("Audi");
        tSet.add("Honda");
        tSet.add("Honda");
        System.out.println(tSet);


        List<String> list = new ArrayList<String>();

        list.add("BMW");
        list.add("Audi");
        list.add("Honda");
        list.add("Honda");
        System.out.println(list);

    }
}
