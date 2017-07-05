package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.List;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList cats = new ArrayList();
    public Cat() {
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Cat.cats.add(new Cat());//напишите тут ваш код
        }
        printCats();
    }

    public static void printCats() {
        for(int i=0; i<10; i++){
            System.out.println(cats.get(i));
            //напишите тут ваш код
        }
    }
}
