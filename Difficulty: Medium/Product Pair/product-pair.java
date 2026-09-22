import java.util.HashSet;
class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> set = new HashSet<>();
        for (int num : arr) {
            if (target == 0 && num == 0) {
                return true;
            }
            if (num != 0 && target % num == 0) {
                long required = target / num;
                if (set.contains(required)) {
                    return true;
                }
            }
            set.add((long) num);
        }
        return false;
    }
}