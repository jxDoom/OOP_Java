package core.ex;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example<T extends Number & Comparable<T> & Iterable<T>>{
    static Map<List<Integer>, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3); // List иммутабельный, т.е. неизменяемый, можно выбрать ArrayList<>()
        map.put(l, 0);

        System.out.println(map.get(l));
    }
}
