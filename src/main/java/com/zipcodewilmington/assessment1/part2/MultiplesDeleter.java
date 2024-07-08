package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        List<Integer> result = new ArrayList<>();

        //Iterate through each number in the array
        for (Integer num : ints) {
            //Check if the number is odd (num % 2 !=0)
            if (num % 2 != 0) {
                //If its odd, add it to the result list
                result.add(num);
            }
        }

        //Convert the list back to an array and return
        return result.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        List<Integer> result = new ArrayList<>();

        //Iterate through each number in the array
        for (Integer num : ints) {
            //Check if the number is even (num % 2 ==0) *Opposite of above*
            if (num % 2 == 0) {
                //If its even, add it to the result list
                result.add(num);
            }
        }

        //Convert the list back to an array and return
        return result.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        List<Integer> result = new ArrayList<>();

        //Need to iterate through each number in array
        for (Integer num : ints) {
            //check if number is not divisible by 3
            if (num % 3 != 0) {
                //if its not divisible by 3, add it to the result list
                result.add(num);
            }
        }

        return result.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> result = new ArrayList<>();

        //Iterate through each number in the array
        for (Integer num : ints) {
            //Check if number is not divisible by multiple (per parameters above)
            if (num % multiple != 0) {
                // if it is not divisible, add it to the result list
                result.add(num);
            }
        }

        return result.toArray(new Integer[0]);
    }
}
