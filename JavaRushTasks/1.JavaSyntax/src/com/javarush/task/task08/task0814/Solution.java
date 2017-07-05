package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet();
        for(int i=0; i<20; i++){
            set.add(i);
        }
        return set;//напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet<Integer> newSet = new HashSet();
        newSet.addAll(set);
        for(Integer x:newSet){
            if(x>10){
                set.remove(x);
            }
        }
        return set;
        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
