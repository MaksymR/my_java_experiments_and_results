package com.example.mysortalgorithms;

/*
 * Sort words in ascending order, numbers - in descending order.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MySortAlgorithms {

    //    compare strings: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    //    Is the strings the number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // string has '-'
                    || (!Character.isDigit(c) && c != '-') // isn't the number and doesn't have '-'
                    || (chars.length == 1 && c == '-')) // single and it's '-'
            {
                return false;
            }
        }
        return true;    // String "s" is the number
    }

    // Sort words in ascending order, numbers - in descending order
    public static void sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (isNumber(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        //descending "bubble sort"
                        if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])) {
                            String numm = array[i];
                            array[i] = array[j];
                            array[j] = numm;
                        }
                    }
                }
            }
            // ascending "bubble sort"
            for (int j = i + 1; j < array.length; j++) {
                if (!isNumber(array[j])) {
                    if (isGreaterThan(array[i], array[j])) {
                        String str = array[i];
                        array[i] = array[j];
                        array[j] = str;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        // input into console: Cat, 4, Bubble, 2, Hat, 100, -10, Apple
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

}
