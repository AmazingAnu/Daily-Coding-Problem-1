import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GetMinimumBonusesTest {

    @Test
    public void test1() {
        assertArrayEquals(
                GetMinimumBonuses.getMinimumBonuses(new int[]{10, 40, 200, 1000, 60, 30}),
                new int[]{1, 2, 3, 4, 2, 1}
        );
    }
}
