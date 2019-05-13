/*
* This problem was asked by Stripe.
* Given an array of integers, find the first missing positive integer in linear time and constant space. In other
* words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and
* negative numbers as well.
*
* For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
*
* You can modify the input array in-place.
*
* */

import java.util.HashSet;
import java.util.Set;

public class FindFirstMissingPositiveInteger {

    public static int findFirstMissingPostiveInteger(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int num : arr) {
            set.add(num);
            max = Math.max(max, num);
        }

        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }
}
