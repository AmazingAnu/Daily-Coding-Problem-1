import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharacterTest {

    @Test
    public void test1() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacter.getLongestSubstringLength("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals(1, LongestSubstringWithoutRepeatingCharacter.getLongestSubstringLength("bbbbb"));
    }

    @Test
    public void test3() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacter.getLongestSubstringLength("pwwkew"));
    }
}
