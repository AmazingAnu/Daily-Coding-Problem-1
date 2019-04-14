import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class HasTargetSumPairTest {

    HasTargetSumPair hasTargetSumPair = new HasTargetSumPair();

    @Test
    public void test1() {
        assertTrue(hasTargetSumPair.checkForTargetSumUsingHashSet(new int[]{1,2,3}, 4));
    }

    @Test
    public void test2() {
        assertFalse(hasTargetSumPair.checkForTargetSumUsingHashSet(new int[]{1,2,3}, 8));
    }
}
