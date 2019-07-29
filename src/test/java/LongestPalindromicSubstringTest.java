import junit.framework.TestCase;
import org.junit.Test;

public class LongestPalindromicSubstringTest extends TestCase {

    @Test
    public void test1() {
        assertEquals("bab", LongestPalindromicSubstring.getLongestPalindromicSubstring("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", LongestPalindromicSubstring.getLongestPalindromicSubstring("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("anana", LongestPalindromicSubstring.getLongestPalindromicSubstring("banana"));
    }

    @Test
    public void test4() {
        assertEquals("illi", LongestPalindromicSubstring.getLongestPalindromicSubstring("million"));
    }

    @Test
    public void test5() {
        assertEquals("racecar", LongestPalindromicSubstring.getLongestPalindromicSubstring("tracecars"));
    }
}