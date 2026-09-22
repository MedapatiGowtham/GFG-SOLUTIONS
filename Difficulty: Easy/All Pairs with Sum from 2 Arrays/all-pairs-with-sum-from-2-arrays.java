import java.util.*;

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<pair> ans = new ArrayList<>();
        int i = 0;
        int j = arr2.length - 1;
        while (i < arr1.length && j >= 0) {
            int sum = arr1[i] + arr2[j];
            if (sum == target) {
                int val1 = arr1[i];
                int val2 = arr2[j];
                int count1 = 0;
                while (i < arr1.length && arr1[i] == val1) {
                    count1++;
                    i++;
                }
                int count2 = 0;
                while (j >= 0 && arr2[j] == val2) {
                    count2++;
                    j--;
                }
                for (int x = 0; x < count1; x++) {
                    for (int y = 0; y < count2; y++) {
                        ans.add(new pair(val1, val2));
                    }
                }

            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans.toArray(new pair[0]);
    }
}