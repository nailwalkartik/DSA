package codingTests;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiOps {
    public static void main(String[] args) {
//        int[] arr = {2,5,6,7,8,9,11,22,21,3,5};
//        List<Integer> arL = new ArrayList<Integer>();
//        arL.add(2);
//        arL.add(3);
//        arL.add(1);
//        arL.add(5);
//        arL.add(3);
//        arL.add(5);
        List<Integer> intList = Arrays.asList(1,2,1,3,4,1);
//        Set<Integer> set = new HashSet<>();
//        IntStream.of(arr)
//                .distinct()
//                .sorted()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);

//        arL.stream()
//                .filter(n -> n%2 == 0)
//                .filter(n -> !set.add(n))
////                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        int[] input = {1,2,3,4,5,1,3,4,5,6,7};

        int[] dup = Arrays.stream(input)
                .boxed()//wrapped the input int array to Integer
                .collect( // performing a mutable reduction of the boxed Integer array
                        Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1).mapToInt(e -> e.getKey()).toArray();

        for (int i : dup) {
            System.out.println(i);

        }
    }
}
