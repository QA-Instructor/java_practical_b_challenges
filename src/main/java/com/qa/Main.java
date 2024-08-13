package com.qa;

// Generics were introduced in Java 5 to provide developers with more compile-time type information.
// Removes the risk of ClassCastException
// Commonly used when working with Collections

import java.util.Arrays;
import java.util.List;

import static com.qa.GenericsChallenges.*;
import static com.qa.GenericsExamples.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("GENERICS EXAMPLES");
//      List Examples
//        nonGenericListExample();
//        genericListExample();

//      Method Examples
//        nonGenericMethodExample();
//        genericMethodExample();

//        Challenges
        todo1();
        todo2();
        todo3();
        todo4();
    }

    public static void todo1(){
        System.out.println("##### Todo 1 #####");
        Integer[] arr1 = { 1, 2, 3, 4};
        Integer[] arr2 = { 1, 2, 4, 4};
        Integer[] arr3 = { 1, 2, 3, 4};

        String[] arr4 = { "Java", "World"};
        String[] arr5 = { "JavaScript", "World"};
        String[] arr6 = { "Java", "World"};

        System.out.println("Original arrays:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));

        System.out.println("\nCompare arr1 and arr2: " + compare_Arrays(arr1, arr2)); //false
        System.out.println("Compare arr1 and arr3: " + compare_Arrays(arr1, arr3)); //true
        System.out.println("Compare arr4 and arr5: " + compare_Arrays(arr4, arr5)); //false
        System.out.println("Compare arr4 and arr6: " + compare_Arrays(arr4, arr6)); //true
    }

    public static void todo2(){
        System.out.println("##### Todo 2 #####");
        List < Integer > integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        calculateNumberSum(integers);
        calculateNumberSum(doubles);
    }
    public static void todo3(){
        System.out.println("##### Todo 3 #####");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> colors = List.of("Red", "Green", "Orange");

        List<Integer> reversedNumbers = reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers); // Output: [6, 5, 4, 3, 2, 1]

        List < String > reversedWords = reverseList(colors);
        System.out.println("\nOriginal list of colors: " + colors);
        System.out.println("Reversed colors: " + reversedWords);
    }

    public static void todo4(){
        System.out.println("##### Todo 4 #####");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Original list of numbers: " + numbers);
        // Filter even numbers
        List<Integer> evenNumbers = filterList(numbers, n -> n % 2 == 0);
        System.out.println("Even numbers: " + evenNumbers);

        // Filter odd numbers
        List<Integer> oddNumbers = filterList(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddNumbers);

        List<String> colors = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        System.out.println("\nOriginal list of Colors: " + colors);
        // Filter colors starting with 'O'
        List<String> wordsStartingWithO = filterList(colors, color -> color.startsWith("O"));
        System.out.println("Colors starting with 'O': " + wordsStartingWithO);

        // Filter colors with length greater than 4
        List<String> wordsLengthGreaterThan4 = filterList(colors, color -> color.length() > 4);
        System.out.println("Colors with length greater than 4: " + wordsLengthGreaterThan4);

    }
}