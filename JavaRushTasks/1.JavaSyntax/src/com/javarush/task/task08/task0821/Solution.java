package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map1 = new HashMap<>();
        map1.put("Kvashaa", "Vladimir");
        map1.put("Plush", "Anna");
        map1.put("Narush", "Serg");
        map1.put("Petrova2", "Anny");
        map1.put("Petrova", "Galy");
        map1.put("Bora", "Galy");
        map1.put("Moros", "Ivan");
        map1.put("Kvashaf", "Marina");
        map1.put("Kvashas", "Sergei");
        map1.put("Kvasha", "Tatyana");

        return map1;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
