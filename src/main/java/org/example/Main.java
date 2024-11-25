package org.example;

import binsrch.MyArray;
import binsrch.MyCollections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример для MyArray:");

        int[] intArray = {1, 3, 5, 7, 9};
        int intKey = 5;
        int intResult = MyArray.binarySearch(intArray, intKey);
        System.out.println("Результат бинарного поиска для int (найдено): " + intResult);

        int intKeyNotFound = 4;
        int intResultNotFound = MyArray.binarySearch(intArray, intKeyNotFound);
        System.out.println("Результат бинарного поиска для int (не найдено): " + intResultNotFound);

        byte[] byteArray = {1, 3, 5, 7, 9};
        byte byteKey = 1;
        int byteResult = MyArray.binarySearch(byteArray, byteKey);
        System.out.println("Результат бинарного поиска для byte (найдено): " + byteResult);

        byte byteKeyNotFound = 4;
        int byteResultNotFound = MyArray.binarySearch(byteArray, byteKeyNotFound);
        System.out.println("Результат бинарного поиска для byte (не найдено): " + byteResultNotFound);

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        char charKey = 'e';
        int charResult = MyArray.binarySearch(charArray, charKey);
        System.out.println("Результат бинарного поиска для char (найдено): " + charResult);

        char charKeyNotFound = 'f';
        int charResultNotFound = MyArray.binarySearch(charArray, charKeyNotFound);
        System.out.println("Результат бинарного поиска для char (не найдено): " + charResultNotFound);

        long[] longArray = {1L, 3L, 5L, 7L, 9L};
        long longKey = 5L;
        int longResult = MyArray.binarySearch(longArray, longKey);
        System.out.println("Результат бинарного поиска для long (найдено): " + longResult);

        // Пример, когда элемент не найден в массиве
        long longKeyNotFound = 4L;
        int longResultNotFound = MyArray.binarySearch(longArray, longKeyNotFound);
        System.out.println("Результат бинарного поиска для long (не найдено): " + longResultNotFound);

        System.out.println("\nПример для MyCollections:");

        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9);
        Integer intKeyList = 5;
        int intResultList = MyCollections.binarySearch(intList, intKeyList);
        System.out.println("Результат бинарного поиска для List<Integer> (найдено): " + intResultList);

        Integer intKeyListNotFound = 4;
        int intResultListNotFound = MyCollections.binarySearch(intList, intKeyListNotFound);
        System.out.println("Результат бинарного поиска для List<Integer> (не найдено): " + intResultListNotFound);

        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");
        String stringKey = "cherry";
        int stringResult = MyCollections.binarySearch(stringList, stringKey);
        System.out.println("Результат бинарного поиска для List<String> (найдено): " + stringResult);

        String stringKeyNotFound = "kiwi";
        int stringResultNotFound = MyCollections.binarySearch(stringList, stringKeyNotFound);
        System.out.println("Результат бинарного поиска для List<String> (не найдено): " + stringResultNotFound);

        List<Integer> intListWithComparator = Arrays.asList(1, 3, 5, 7, 9);
        Integer intKeyWithComparator = 5;
        int intResultWithComparator = MyCollections.binarySearch(intListWithComparator, intKeyWithComparator, Comparator.naturalOrder());
        System.out.println("Результат бинарного поиска с Comparator для List<Integer> (найдено): " + intResultWithComparator);

        Integer intKeyWithComparatorNotFound = 4;
        int intResultWithComparatorNotFound = MyCollections.binarySearch(intListWithComparator, intKeyWithComparatorNotFound, Comparator.naturalOrder());
        System.out.println("Результат бинарного поиска с Comparator для List<Integer> (не найдено): " + intResultWithComparatorNotFound);

    }
}
