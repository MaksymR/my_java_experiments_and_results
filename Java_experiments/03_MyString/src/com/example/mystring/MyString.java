package com.example.mystring;

/*
 * Get a new string from an old string without "whitespace" ("\\s")
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MyString {

    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'y'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // input e.g.: "Home is my sweet home."
        String oldLine = bufferedReader.readLine();
//        x = x.replaceAll("\\s", "");  The first one matches a single whitespace,
//        x = x.replaceAll("\\s+", "");  where as the second one matches one or many whitespaces.  -  https://goo.gl/j2MAje
        String newLine = oldLine.replaceAll("\\s+", "");

        char[] simpleCharArray = newLine.toCharArray();
        ArrayList<Character> generalSounds = new ArrayList<>();
        ArrayList<Character> consonantSounds = new ArrayList<>();
        ArrayList<Character> vowelSounds = new ArrayList<>();

        for (Character character : simpleCharArray) {
            generalSounds.add(character);
        }

        for (Character character : generalSounds) {
            if (isVowel(character)) {
                vowelSounds.add(character);
            } else {
                consonantSounds.add(character);
            }
        }
        String vowelLine = "";
        for (Character character : vowelSounds) {
            vowelLine += character;
            vowelLine += " ";
        }

        String consonantLine = "";
        for (Character character : consonantSounds) {
            consonantLine += character;
            consonantLine += " ";
        }

        System.out.println(vowelLine);
        System.out.println(consonantLine);

        bufferedReader.close();
    }

}
