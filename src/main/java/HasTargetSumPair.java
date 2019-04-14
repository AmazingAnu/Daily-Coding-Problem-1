import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?*/

public class HasTargetSumPair {

    public boolean checkForTargetSumUsingHashSet(int[] arr, int targetSum) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(targetSum-num)) {
                return true;
            }

            set.add(num);
        }
        return false;
    }
}