import java.util.Arrays;

class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        int count = 0;
        Arrays.sort(arr, mid, n);
        for (int i = 0; i < mid; i++) {
            int left = mid;
            int right = n;
            while (left < right) {
                int m = left + (right - left) / 2;
                if (5L * arr[m] <= arr[i]) {
                    left = m + 1;
                } else {
                    right = m;
                }
            }
            count += left - mid;
        }
        return count;
    }
}