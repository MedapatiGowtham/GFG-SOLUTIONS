class Solution {
    public int secFrequent(String[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int first = 0;
        int second = 0;

        for (int freq : map.values()) {
            if (freq > first) {
                second = first;
                first = freq;
            } else if (freq > second && freq < first) {
                second = freq;
            }
        }

        return second == 0 ? -1 : second;
    }
}