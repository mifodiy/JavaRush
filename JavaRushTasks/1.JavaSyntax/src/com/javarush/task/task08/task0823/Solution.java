package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++){
            if (!words[i].equals("")){
                words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
            }

            if (i == words.length - 1) {
                result += words[i];
            } else {
                result += words[i] + " ";
            }
        }

        System.out.println(result);
    }
}
