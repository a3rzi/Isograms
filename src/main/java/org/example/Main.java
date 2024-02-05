package org.example;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //given
        System.out.println("please input a word:\t");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        //when
        boolean result = isIsogram(str);
        System.out.println("The input word is isogram?\t"+result);

    }
    private static boolean isIsogram(String str) {
        //Assume the empty string is an isogram
        if (str.isEmpty()){
            return true;
        }
        //Ignore letter case.
        //convert to lower case
        str = str.toLowerCase();
        // Use a set to keep track of unique letters
        Set<Character> unique = new HashSet<>();

        // Iterate through each character in the string
        for (char letter : str.toCharArray()){
        // If the character is already in the set, it's a repeat
            if (unique.contains(letter)){
                return false; //condition is true
            }
        // Otherwise, add the character to the set
            else unique.add(letter); //condition is false
        }
        // If no repeating letters are found, it's an isogram
        return true;

    }


}