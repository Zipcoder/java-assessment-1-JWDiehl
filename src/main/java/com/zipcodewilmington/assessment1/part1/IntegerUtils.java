package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        //Write method to getSumOfN(int n)

        //Initialize a sum var
        int sumOfN = 0;

        //for loop to iterate through n
        for (int i = 0; i <= n; i++) {
            sumOfN += i;
        }

        return sumOfN;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        // Write method to getProductOfN(int n)

        if (n <= 0) {
            return 0;
        }

        //initialize variable for product of n
        int productThroughN = 1;

        //iterate through
        for (int i = 1; i <= n; i++) {
            productThroughN *= i;
        }

        return productThroughN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        //Write method to reverseDigits(int val)

        //Initialize a reverse var
        int reversed = 0;

        //Loop
        while (val !=0) {
            //get last digit of val
            int digit = val % 10;
            //Add new value to reversed number
            reversed = reversed * 10 + digit;

            //remove last dig  (value / 10)
            val /= 10;
        }

        return reversed;
    }
}
