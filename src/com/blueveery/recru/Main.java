package com.blueveery.recru;

import java.util.Arrays;
import java.util.List;

public class Main {
    // Given an array of strings, return another array containing all of its longest strings.
    // Example:
    // For inputArray = ["ad", "aa", "aba", "vcd", "aba"], the output should be
    // allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

    static List<String> inputArray = Arrays.asList("ad", "aa", "aba", "vcd", "aba");

    public static void main(String[] args) {
        System.out.println("Result:");
        allLongestStrings(inputArray).forEach(System.out::println);
    }

    public static List<String> allLongestStrings(List<String> inputArray) {
        // write your code here
        return inputArray;
    }

}
