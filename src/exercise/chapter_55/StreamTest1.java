package exercise.chapter_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {

        // Stream.of, Arrays.Stream, Collection( = List) -> Stream

        // Stream.of
        Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        // Arrays.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "Banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3,4,5,6,7,8,9,10});

        // Collection( = List) -> Stream
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Mango");
        fruitList.add("Grapes");

        Stream<String> fruit3 = fruitList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        // Stream 가지고 For-loop
        for(String fruit:fruitList){
            System.out.println("for-loop로 fruit 산출 : " + fruit.toUpperCase());
        }

        // Stream
        fruit3.forEach(((fruit) -> System.out.println("forEach로 fruit 산출 : " + fruit.toUpperCase())));

        for (Integer integer : integerList){
            if (integer % 2 == 0) System.out.println("for-loop로 산출 : " + integer);
            else continue;
        }

        integerStream3.filter((i) -> i%2==0)
                .filter((i)-> i>4)
                .forEach(i-> System.out.println("forEach로 산출: " + i));

        // IllegalStateException 발생 스트림은 두번 사용이 안됨.

    }

}
