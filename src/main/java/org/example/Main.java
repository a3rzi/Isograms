package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //given
        String str = "AmirhosSein";

        //when
        boolean result = isIsogram(str);
        System.out.println(result);


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
        // Iterate through each character in the string
        // If the character is already in the set, it's a repeat
        // Otherwise, add the character to the set
        // If no repeating letters are found, it's an isogram
        return true;

    }


}