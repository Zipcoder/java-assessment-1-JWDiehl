package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        // Calculate full jumps of j units Tariq can make
        int fullJumps = k / j;

        //Calculate remaining height after full jumps of j units
        int remainingHeight = k % j;

        // If j is greater than or equal to k
        // Tariq can reach the flag in one jump
        if (j >= k) {
            return 1;
        }

        //Calculate min jumps required
        if (remainingHeight == 0) {
            return fullJumps;
        } else {
            return fullJumps + 1;
        }

//        return -1;
    }
}
