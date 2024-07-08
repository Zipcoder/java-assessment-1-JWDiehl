package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        //Need to write a method to getSum(Integer[] intArray)

        //Initialize first
        int sumOfIntegers = 0;
        for (Integer num : intArray) {
            sumOfIntegers += num;
        }

        return sumOfIntegers;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        //Need to write a method to getProduct(Integer[] intArray)

        //Initialize
        int productOfIntegers = 1;
        for (Integer num : intArray) {
            productOfIntegers *= num;
        }

        return productOfIntegers;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        //Need to write a method to getAverage(Integer[] intArray)

        //Initialize to get sum
        int sumOfNum = getSum(intArray);

        //Average = sum / count
        return (double) sumOfNum / intArray.length;
    }
}
