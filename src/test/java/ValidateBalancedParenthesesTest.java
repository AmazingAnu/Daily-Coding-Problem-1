import junit.framework.TestCase;
import org.junit.Test;

public class ValidateBalancedParenthesesTest extends TestCase {

    @Test
    public void test1() {
        assertEquals(true, ValidateBalancedParentheses.isValid("()"));
    }

    @Test
    public void test2() {
        assertEquals(true, ValidateBalancedParentheses.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertEquals(false, ValidateBalancedParentheses.isValid("(]"));
    }

    @Test
    public void test4() {
        assertEquals(false, ValidateBalancedParentheses.isValid("([)]"));
    }

    @Test
    public void test5() {
        assertEquals(true, ValidateBalancedParentheses.isValid("{[]}"));
    }
}