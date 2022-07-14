package Zahlen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zahlen {


    public static List<Integer> sortNumbers() {
        List<Integer> zahlen = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);
        List<Integer> sortedList = zahlen.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        return sortedList;
    }

    public static int summeZahlen() {
        List<Integer> zahlen = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);

        int summe = zahlen.stream().collect((Collectors.summingInt(Integer::intValue)));
        System.out.println(summe);
        return summe;
    }

    public static int produktZahlen() {
        List<Integer> zahlen = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);

        int ergebnis = zahlen.stream().reduce(1, (x, y) -> x * y);
        System.out.println(ergebnis);
        return ergebnis;
    }
}
