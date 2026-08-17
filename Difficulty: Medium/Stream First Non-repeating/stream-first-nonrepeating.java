class Solution {
    public String firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);
            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }
}