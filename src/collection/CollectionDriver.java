package collection;

import dsapractice.DataStructureBigO1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CollectionDriver {
    public static void driver(){
//        var squareOfKey = new PracticeMap().map;
//        for (int i = 1; i <= 10; i++) {
//            squareOfKey.put(i,i*i);
//        }
//
//        squareOfKey.keySet().stream().map(key->squareOfKey.put(squareOfKey.get(key),squareOfKey.get(key)*squareOfKey.get(key)*squareOfKey.get(key))).forEach(System.out::println);
//
//        System.out.println(squareOfKey);
//
//        var keySet = squareOfKey.keySet();
//
//        keySet.remove(2);
//        squareOfKey.remove(3);
//
//        // you can't do it as veiw, map relationship...
////        keySet.add(11);
//        System.out.println(squareOfKey.getOrDefault(2,2*2));
//
//        System.out.println(squareOfKey.get(2));
//
//        squareOfKey.putIfAbsent(2,2*2);
//
//        //doesn't update anything...
//        squareOfKey.putIfAbsent(4,14);
//
//        System.out.println(squareOfKey);
//
//        squareOfKey.replaceAll((key, value) -> key*key*key);
//
//        System.out.println(squareOfKey);
//
//        for (int i = 1; i <= 10; i++) {
//            squareOfKey.computeIfAbsent(i,no->no*no);
//        }
//
//        System.out.println(squareOfKey);
//
//        squareOfKey.replaceAll((key, value) -> key*key);
//
//        System.out.println(squareOfKey);
//
////        squareOfKey = new LinkedHashMap<>();
//
//        //Java streams use to iterate...
//        List<Integer> smallOddSquares =  squareOfKey.keySet()
//                                        .stream()
//                                        .filter(key->key<9)
//                                        .map(key->key*key)
//                                        .dropWhile(key->key%2==0)
//                                        .toList();
//        System.out.println();
//        System.out.println(smallOddSquares);
//        for (int key:squareOfKey.keySet()){
//            System.out.println(key);
//        }


//        MyStackWithConstantPushPopGetMax mstack = new MyStackWithConstantPushPopGetMax();
//        mstack.push(3);
//        mstack.push(5);
//        mstack.getMax();
//        mstack.push(7);
//        mstack.push(19);
//        mstack.getMax();
//        mstack.pop();
//        mstack.getMax();
//        mstack.pop();
//        mstack.peek();
//        mstack.pop();
//        mstack.pop();
//        mstack.pop();


        DataStructureBigO1 ds = new DataStructureBigO1();
        ds.insert(5);
        ds.insert(65);
        ds.insert(0);
        ds.remove(5);
        System.out.println(ds.getMin());
        System.out.println(ds.getMax());
        ds.remove(0);
        ds.remove(65);

    }

    public static void main(String[] args) {
        var squareOfKey = new PracticeMap().map;
        for (int i = 1; i <= 10; i++) {
            squareOfKey.put(i,i*i);
        }
        squareOfKey.entrySet().stream().forEach(System.out::println);

        List<Integer> smallOddSquares = squareOfKey.keySet()
                .stream()
                .filter(key->key<9)
                .map(key->key*key)
                .dropWhile(value->value%2==0)
                .toList();

        System.out.println(smallOddSquares);
    }
}
