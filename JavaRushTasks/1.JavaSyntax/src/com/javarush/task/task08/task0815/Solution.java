package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Кваша","Владимир");
        map.put("Плющева","Анна");
        map.put("Кваша","Марина");
        map.put("Назаренко","Александр");
        map.put("Кваша","Сергей");
        map.put("Баки","Анна");
        map.put("Нарушкевич","Сергей");
        map.put("Нарушкевич","Вита");
        map.put("Васильчук","Жанна");
        map.put("Опока","Алексей");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }
        return  map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countName=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(name)){
                countName++;
            }
        }
        return countName;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countLastName=0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(lastName)){
                countLastName++;
            }
        }
        return countLastName;//напишите тут ваш код

    }

    public static void main(String[] args) {
        createMap();

    }
}
