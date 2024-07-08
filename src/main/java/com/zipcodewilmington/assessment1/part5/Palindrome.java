package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        //Function to count palindromic substrings in a given string
        //Palindromic = the same if we start reading it from left to right or right to left.

        int count = 0;
        int n = input.length();

        //Check all possible centers of palindromes
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            //Check for palindromes
            while (left >= 0 && right < n && input.charAt(left) == input.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}
