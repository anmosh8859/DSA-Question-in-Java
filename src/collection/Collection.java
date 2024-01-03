package collection;

import java.util.*;

public class Collection{
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(intList);
//        intList.remove(3); reports error as asList methods the unmodifiable ArrayList
        System.out.println(intList.contains(5));
        System.out.println(intList.get(0));
        System.out.println(intList);

        Set<String> ts = new TreeSet<>();
        ts.add("Anand");
        ts.add("Hello World");
        ts.add("Coding");
        System.out.println(ts);

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1,"Ricky");
        map.put(6,"Ankit");
        map.put(3,"Naveen");
        map.put(2,"Ran Vijay");

        System.out.println(map);

        map.put(3,"Saurabh");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(25);
        pq.offer(14);

        System.out.println(pq);

        System.out.println(map);

        System.out.println(map.ceilingKey(5));

        List list = new ArrayList();
        list.add(1);
        list.add("Anand");
        System.out.println(list);
    }
}
