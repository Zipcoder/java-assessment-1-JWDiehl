package com.zipcodewilmington.assessment1.part2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        //Need to write method to count occurrences of an object in an array

        //initialize count
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //Need to write method to remove all occurrences of an object from an array

        //Array list
        List<Object> resultList = new ArrayList<>();

        //Iterate through the array
        for (int i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                resultList.add(objectArray[i]);
            }
        }

        return resultList.toArray(new Object[resultList.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Map<Object, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < objectArray.length; i++) {
            Object current = objectArray[i];
            if (frequencyMap.containsKey(current)) {
                frequencyMap.put(current, frequencyMap.get(current) + 1);
            } else {
                frequencyMap.put(current,1);
            }
        }

        Object mostCommon = null;
        int maxFrequency = 0;

        for (Map.Entry<Object, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < objectArray.length; i++) {
            Object current = objectArray[i];
            if (frequencyMap.containsKey(current)) {
                frequencyMap.put(current, frequencyMap.get(current) + 1);
            } else {
                frequencyMap.put(current, 1);
            }
        }

        Object leastCommon = null;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Object, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < minFrequency) {
                minFrequency = entry.getValue();
                leastCommon = entry.getKey();
            }
        }

        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        //Merge two arrays into one

        Object[] mergeArrays = new Object[objectArray.length + objectArrayToAdd.length];

        //Copying elements from objectArray to mergedArray
        //Iterate through the array
        for (int i = 0; i < objectArray.length; i++) {
            mergeArrays[i] = objectArray[i];
        }

        //Need to copy elements from objectArrayToAdd to mergedArray
        for (int i = 0; i < objectArray.length; i++) {
            mergeArrays[objectArray.length + i] = objectArrayToAdd[i];
        }


        return mergeArrays;
    }
}
