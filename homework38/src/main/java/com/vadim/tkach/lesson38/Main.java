package com.vadim.tkach.lesson38;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(4);
        a.add(3);
        List<Integer> array = new ArrayList<>(a);
        System.out.println("Unique elements " + array);


        Map<String, Integer> b = new HashMap<String, Integer>();
        b.put("a", 1);
        b.put("b", 2);

        Map<String, Integer> c = new HashMap<String, Integer>();
        c.put("a", 2);
        c.put("c", 3);

        Map<String, Integer> d = addKeys(b, c);
        System.out.println("Merging Map " + d);
    }

        public static Map<String, Integer> addKeys (Map < String, Integer > first, Map < String, Integer > second){
            Map<String, Integer> result = new HashMap<>();

            for (Map.Entry<String, Integer> entry : first.entrySet()) {
                result.put(entry.getKey(), entry.getValue());
            }

            for (Map.Entry<String, Integer> entry : second.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                result.put(key, result.getOrDefault(key, 0) + value);
            }
            return result;
        }
    }


