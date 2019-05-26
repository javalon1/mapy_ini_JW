package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jan");
        map.put(2, "Kamil");
        map.put(3, "Zosia");
        System.out.println(map);

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println("Klucz: " + m.getKey());
            System.out.println("Wartość: " + m.getValue());
        }

        Map<String, List<String>> food = new HashMap<>();
        List<String> wegan = new ArrayList<>();
        wegan.add("BANAN");
        wegan.add("POMIDOR");
        wegan.add("ZIEMNIAK");

        List<String> halal = new ArrayList<>();
        halal.add("BARAN");
        halal.add("KURCZAK");
        halal.add("WOLOWINA");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("MARCHEWKA");
        koszerne.add("HUMUS");
        koszerne.add("FALAFEL");

        food.put("WEGAN", wegan);
        food.put("HALAL", halal);
        food.put("KOSZERNE", koszerne);

        System.out.println(food);
        for (Map.Entry<String, List<String>> m : food.entrySet()) {
            System.out.println(m.getKey());
            List<String> values = food.get(m.getKey());
            for (String val : values) {
                System.out.println(" - " + val);
            }
        }
    }
}
