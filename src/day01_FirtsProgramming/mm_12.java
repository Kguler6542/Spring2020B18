package day01_FirtsProgramming;

import java.util.*;


public class mm_12 {
    public static void main(String[] args) {

        String str = "The quick brown fox jumped under the nearby tree. What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. the fox blushed under the tree.";

        String str2 = str.replaceAll("[.]", "").toLowerCase();

        String[] arr = str2.split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        List<String> list2 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int countMount = Collections.frequency(list, list.get(i));
            if (countMount > 1) {
                list2.add(list.get(i));

            }
        }

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < list2.size(); i++) {
            int count = Collections.frequency(list2, list2.get(i));
            map.put(list2.get(i), count);
        }

        System.out.println(map);




    }
}



