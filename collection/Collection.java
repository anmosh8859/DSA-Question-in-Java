package collection;

import java.util.*;

public class Collection{
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        int [] arr = {1,2,3,4,5,6,7};
        intList.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(intList.contains(5));
        System.out.println(intList.get(0));
        System.out.println();

        Set<String> ts = new TreeSet<>();
        ts.add("Anand");
        ts.add("Hello World");
        ts.add("Coding");
        System.out.println(ts);

        Map<Integer, String> map = new TreeMap<>();

        map.put(1,"Ricky");
        map.put(6,"Ankit");
        map.put(3,"Naveen");
        map.put(2,"Ran Vijay");

        System.out.println(map);
    }
}
