import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class SentenceCheckerTest {

    @Test
    public void test1() {
        char[] characters = {'H', 'e', 'y', '.', 'T', 'h', 'e', 'r', 'e', '!'};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Arrays.asList("Hey.", "There!"));
    }

    @Test
    public void test2() {
        char[] characters = {'h', 'e', 'y', '.', 'T', 'h', 'e', 'r', 'e', '!'};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Arrays.asList("There!"));
    }

    @Test
    public void test3() {
        char[] characters = {'h', 'e', 'y', ',', 'j', 'a', 'k', 'e', '.', 'T', 'h', 'e', 'r', 'e', '!'};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Arrays.asList("Hey jake.", "There!"));
    }
}
