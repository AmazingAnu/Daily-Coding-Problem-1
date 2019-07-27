import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int getLongestSubstringLength(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLen = 0;

        while (end < n) {
            if (set.contains(s.charAt(end))) {
                while (start < end && set.contains(s.charAt(end))) {
                    set.remove(s.charAt(start++));
                }
            }

            set.add(s.charAt(end++));
            maxLen = Math.max(maxLen, end - start);
        }

        return maxLen;
    }
}
