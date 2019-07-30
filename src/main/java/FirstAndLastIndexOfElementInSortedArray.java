public class FirstAndLastIndexOfElementInSortedArray {
    public static int[] getIndices(int[] arr, int target) {
        return new int[]{getFirstIndex(arr, target), getLastIndex(arr, target)};
    }

    private static int getLastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    idx = mid;
                }

                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return idx;
    }

    private static int getFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int idx = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] >= target) {
                if (arr[mid] == target) {
                    idx = mid;
                }

                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return idx;
    }
}
