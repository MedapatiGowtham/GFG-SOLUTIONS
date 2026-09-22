class Solution {
    static int countPairs(int a[], int b[], int x) {
        int i = 0;
        int j = b.length - 1;
        int count = 0;
        while (i < a.length && j >= 0) {
            int sum = a[i] + b[j];
            if (sum == x) {
                count++;
                i++;
                j--;
            } 
            else if (sum < x) {
                i++;
            } 
            else {
                j--;
            }
        }
        return count;
    }
}