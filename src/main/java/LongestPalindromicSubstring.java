public class LongestPalindromicSubstring {
    public static String getLongestPalindromicSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[2];
            expandCenter(s, i, i, arr);
            if (arr[1] - arr[0] > end - start) {
                start = arr[0];
                end = arr[1];
            }

            expandCenter(s, i, i + 1, arr);
            if (arr[1] - arr[0] > end - start) {
                start = arr[0];
                end = arr[1];
            }
        }

        return s.substring(start, end + 1);
    }

    private static void expandCenter(String s, int x, int y, int[] arr) {
        if (x < 0 || y >= s.length()) {
            return;
        }

        if (s.charAt(x) != s.charAt(y)) {
            return;
        }

        arr[0] = x;
        arr[1] = y;

        expandCenter(s, x - 1, y + 1, arr);
    }
}
