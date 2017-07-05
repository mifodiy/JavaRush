package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        Cat cat3=new Cat();
        Cat cat4=new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogSet = new HashSet<>();
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);
        //напишите тут ваш код
        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> join = new HashSet<>();
        for(Cat x:cats){
            join.add(x);
        }
        for(Dog y:dogs){
            join.add(y);
        }
        //напишите тут ваш код
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        if(pets.containsAll(cats)){
            pets.removeAll(cats);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x: pets) {
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat{}
    public static class Dog{}

}
