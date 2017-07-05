package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        int[] arr = new int[20];
        //System.out.println("Enter number");
        for(int i=0; i<20; i++){
            arr[i]=Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);

        int maximum=arr[19];
        int minimum=arr[0];
        //напишите тут ваш код

        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}
