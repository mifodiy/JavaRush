package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        //System.out.println("enter number");
        String string = reader.readLine();
        int number = Integer.parseInt(string);
        //System.out.println("Enter " + number + " numbers");
        for (int i = 0; i < number; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (maximum < list.get(i))
                maximum = list.get(i);
        }
        System.out.println(maximum);

        //напишите тут ваш код


    }


}
