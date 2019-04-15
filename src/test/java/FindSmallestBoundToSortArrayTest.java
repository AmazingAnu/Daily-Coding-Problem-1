import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindSmallestBoundToSortArrayTest {

    @Test
    public void test1() {
        assertArrayEquals(FindSmallestBoundToSortArray.findSmallestBound(new int[]{3, 7, 5, 6, 9}), new int[]{1, 3});
    }
}
