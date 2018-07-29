import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

/*Given an array of integers, find the first missing positive integer in linear time and constant space. In other
words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and
negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/

public class LowestPositiveIntegerNotInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        System.out.println(getLowestPositiveInteger(arr));
    }

    private static int getLowestPositiveInteger(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        while (min++ <= max) {
            if (set.contains(min) == false && min > 0) {
                return min;
            }
        }

        return max + 1;
    }
}
