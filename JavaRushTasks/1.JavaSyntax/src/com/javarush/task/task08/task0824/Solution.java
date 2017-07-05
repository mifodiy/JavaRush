package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import javax.swing.event.HyperlinkEvent;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> list = new ArrayList<>();
        ArrayList<Human> list2 = new ArrayList<>();
        ArrayList<Human> list3 = new ArrayList<>();
        Human vova = new Human("Vova", true, 27, new ArrayList<Human>());
        Human anya = new Human("Anya", false, 28,new ArrayList<Human>());
        Human petya = new Human("Petya", true, 26, new ArrayList<Human>());
        list.add(vova);
        list.add(anya);
        list.add(petya);
        Human tanya = new Human("Tanya", false, 55, list);
        Human serge = new Human("Serge", true, 53,list);
        list2.add(tanya);
        list3.add(serge);
        Human lida = new Human("Lida", false, 85, list3);
        Human afanas = new Human("Afanas", true, 84, list3);
        Human anyaa = new Human("Anya", false, 82, list2);
        Human anatol = new Human("Anatol", true, 80, list2);

        System.out.println(vova);
        System.out.println(anya);
        System.out.println(petya);
        System.out.println(tanya);
        System.out.println(serge);
        System.out.println(lida);
        System.out.println(afanas);
        System.out.println(anyaa);
        System.out.println(anatol);
        //напишите тут ваш код
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
