package com.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericsChallenges {
//    Work your way through the following challenges.

//Todo 1: Compare arrays
//    Write a Java generic method that takes two arrays of the same type and
//    checks if they have the same elements in the same order.
//    This method should return a boolean.

    public static <T> boolean compare_Arrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }


//Todo 2: Sum odds and evens
//    Write a Java generic method that takes a list of numbers
//    and prints the sum of all the even and odd numbers.
//    This method should work with integers and doubles.

    public static <T extends Number> void calculateNumberSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;

        for (T number: numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("\nOriginal list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

//Todo 3: Reverse list
//    Write a Java generic method that takes a list of any type and
//    returns it as a new list with the elements in reverse order.

    public static < T > List< T > reverseList(List < T > originalList) {
        List < T > reversedList = new ArrayList< >();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
//Todo 4: Filter list
//    Write a Java generic method that takes a list of any type and a predicate.
//    It should return an array list containing only elements that satisfy the predicate.

    public static <T> List<T> filterList(List<T> originalList, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T element: originalList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }

        return filteredList;
    }
}
