package lab4.Test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import lab4.PalindromeChecker;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }
}
