package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        //int num = 1;
        Date dateHelp = new Date(date);
        Date startYear = new Date(date);

        startYear.setYear(dateHelp.getYear());
        startYear.setMonth(0);
        startYear.setDate(0);

        long millis = dateHelp.getTime() - startYear.getTime();
        int days = (int) ((millis / 1000) / 3600) / 24;
        //System.out.println(days);
        return days % 2 != 0;
    }
}