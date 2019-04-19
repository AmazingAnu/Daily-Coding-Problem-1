import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Collections.singletonList("There!"));
    }

    @Test
    public void test3() {
        char[] characters = {'H', 'e', 'y', ',', 'j', 'a', 'k', 'e', '.', 'T', 'h', 'e', 'r', 'e', '!'};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Arrays.asList("Hey,jake.", "There!"));
    }

    @Test
    public void test4() {
        char[] characters = {'H', 'e', 'y', 'Y', 'J', 'a', 'k', 'e', ',', 'T', 'h', 'e', 'r', 'e', '!'};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), Collections.singletonList("There!"));
    }

    @Test
    public void test5() {
        char[] characters = {'H', 'e', 'y', 'Y', 'J', 'a', 'k', 'e', ',', 'T', 'h', 'e', 'r', 'e', ','};
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters), new ArrayList<>());
    }

    @Test
    public void test6() {
        char[] characters = "hey there How are you? All good! what about nNow?".toCharArray();
        assertEquals(SentenceChecker.sentenceCheckerImpl(characters),
                Arrays.asList("How are you?", "All good!", "Now?"));
    }
}
