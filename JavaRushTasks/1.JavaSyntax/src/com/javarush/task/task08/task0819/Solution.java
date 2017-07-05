package com.javarush.task.task08.task0819;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
       //System.out.println("Create cat");
        Cat cat1 = new Cat();
        //System.out.println(cat1.toString());
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        //напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for(Cat x:cats){
            System.out.println(x);
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
