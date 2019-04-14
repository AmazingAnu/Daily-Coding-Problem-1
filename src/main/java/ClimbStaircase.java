/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

/*There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a
function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive
integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.*/

public class ClimbStaircase {

    private int findNumberOfWays(int n) {
        int[] memo = new int[n+1];
        return climbStairs(memo, 0, n);
    }

    private int climbStairs(int[] memo,  int i, int n) {
        if (i > n) return 0;
        if (i == n) return 1;

        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = climbStairs(memo, i+1, n) + climbStairs(memo, i+2, n);

        return memo[i];
    }

    private int findNumberOfWaysForGivenSteps(int n, int[] ways) {
        int[] memo = new int[n+1];
        return climbStairsInGivenWays(memo, 0, n, ways);
    }

    private int climbStairsInGivenWays(int[] memo, int i, int n, int[] ways) {
        if (i > n) return 0;
        if (i == n) return 1;

        if (memo[i] > 0) {
            return memo[i];
        }

        for (int way : ways) {
            memo[i] += climbStairsInGivenWays(memo, i+way, n, ways);
        }

        return memo[i];
    }
}
