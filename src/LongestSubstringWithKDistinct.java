/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

/*Given an integer k and a string s, find the length of the longest substring that contains at most k distinct
characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".*/

public class LongestSubstringWithKDistinct {
    public static void main(String[] args) {
        String s = "abcbbaaa";
        int k = 2;

        System.out.println(findLongestSubstring(s, k));
    }

    private static String findLongestSubstring(String s, int k) {
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        int[] counter = new int[26];
        int maxDistinct = 0;

        for (int i=0; i<s.length(); i++) {
            if (counter[s.charAt(i) - 'a'] != 0) {
                counter[s.charAt(i) - 'a']++;
                sb.append(s.charAt(i));
            }
            else {
                if (maxDistinct == k) {
                    if (ans.length() < sb.length()) {
                        ans = sb.toString();
                    }
                    sb.append(s.charAt(i));
                    counter[s.charAt(i) - 'a']++;
                    maxDistinct++;

                    while (maxDistinct > k) {
                        counter[sb.charAt(0) - 'a']--;
                        if (counter[sb.charAt(0) - 'a'] == 0) {
                            maxDistinct--;
                        }
                        sb.deleteCharAt(0);
                    }
                }
                else {
                    counter[s.charAt(i) - 'a']++;
                    sb.append(s.charAt(i));
                    maxDistinct++;
                }
            }
        }

        if (maxDistinct == 2 && sb.length() > ans.length()) {
            ans = sb.toString();
        }

        return ans;
    }
}
