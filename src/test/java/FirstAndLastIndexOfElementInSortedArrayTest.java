import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FirstAndLastIndexOfElementInSortedArrayTest extends TestCase {

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{6, 8},
                FirstAndLastIndexOfElementInSortedArray.getIndices(new int[]{1,3,3,5,7,8,9,9,9,15}, 9));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[]{1, 2},
                FirstAndLastIndexOfElementInSortedArray.getIndices(new int[]{100, 150, 150, 153}, 150));
    }

    @Test
    public void test3() {
        Assert.assertArrayEquals(new int[]{-1, -1},
                FirstAndLastIndexOfElementInSortedArray.getIndices(new int[]{1,2,3,4,5,6,10}, 9));
    }

    @Test
    public void test4() {
        Assert.assertArrayEquals(new int[]{1, 4},
                FirstAndLastIndexOfElementInSortedArray.getIndices(new int[]{1, 2, 2, 2, 2, 3, 4, 7, 8, 8}, 2));
    }
}