import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFirstMissingPositiveIntegerTest {

    @Test
    public void test1() {
        assertEquals(FindFirstMissingPositiveInteger.findFirstMissingPostiveInteger(new int[]{3, 4, -1, 1}), 2);
    }

    @Test
    public void test2() {
        assertEquals(FindFirstMissingPositiveInteger.findFirstMissingPostiveInteger(new int[]{1, 2, 0}), 3);
    }
}
