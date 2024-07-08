package com.zipcodewilmington.assessment1.part2;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        return sentence.split("\\s+");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] wordsIn = sentence.split("\\s+");
        if (wordsIn.length > 0) {
            return wordsIn[0];
        } else {
            return null;
        }
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] wordsIn = sentence.split("\\s+");
        if (wordsIn.length > 0) {
            //Call to the first word with index 0
            String firstWord = wordsIn[0];
        } else {
            return null;
        }

        //Create new string with string builder -- use index to return first word
        StringBuilder reversedString = new StringBuilder(wordsIn[0]);
        return reversedString.reverse().toString();
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String[] wordsIn = sentence.split("\\s+");

        //Isolate first word and then reverse
        if (wordsIn.length > 0) {
            String firstWord = wordsIn[0];
            String reversed = reverse(firstWord);
            //Capitalize first word
            return reversed.substring(0, 1).toUpperCase() + reversed.substring(1);
        } else {
            return null;
        }
    }

    /**
     * @param str   string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        return str.substring(0, index) + str.substring(index + 1);
    }

}
