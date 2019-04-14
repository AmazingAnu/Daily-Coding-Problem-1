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

    private int getLowestPositiveIntegerOld(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        int temp = 1;

        while (temp <= max) {
            if (set.contains(temp) == false && temp > 0) {
                return temp;
            }

            temp++;
        }

        return max + 1 == 0 ? 1 : max+1;
    }

    private int getLowestPositiveInteger(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; ++i)  {
            int num = arr[i];
            while (num <= n && num > 0 && arr[num - 1] != num) {
                int temp = arr[num-1];
                arr[num-1] = arr[i];
                arr[i] = temp;

                num = arr[i];
            }
        }

        for (int i = 0; i < n; ++i) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
