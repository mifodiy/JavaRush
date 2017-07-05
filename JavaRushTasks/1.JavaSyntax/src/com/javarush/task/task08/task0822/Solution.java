package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();

        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        Integer[] myArray; // конвертируем ArrayList в массив
        myArray = array.toArray(new Integer[array.size()]);

        int tmp;
        for(int i=0; i<myArray.length; i++){
            for (int k=i+1; k<myArray.length; k++) {
                if (myArray[i] < myArray[k]) {
                    tmp = myArray[i];
                    myArray[i]= myArray[k];
                    myArray[k]=tmp;
                }
            }
        }
        return myArray[myArray.length-1];
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        for(int i=0; i<count; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
