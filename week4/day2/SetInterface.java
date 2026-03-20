package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Class Name: UniqueCharactersUsingSet
 * It identifies and prints only unique characters from a given string
 * while maintaining the original order of characters.
 */
public class SetInterface {

    public static void main(String[] args) {

        // Given input string
        String companyName = "google";

        /*
         * Creating a Set of Character type.
         * LinkedHashSet is used to avoid duplicates
         * and to maintain insertion order.
         */
        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        // Iterating through each character in the string
        for (int i = 0; i < companyName.length(); i++) {
            uniqueCharacters.add(companyName.charAt(i));
        }

        // Printing unique characters
        for (Character ch : uniqueCharacters) {
            System.out.print(ch);
        }
    }
}

