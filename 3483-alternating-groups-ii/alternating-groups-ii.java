class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for (int r = 0; r < n + k - 1; r++) {
            int color = colors[r % n]; // Circular array access

            // Remove front element if deque size exceeds k
            if (deque.size() == k) {
                deque.pollFirst();
            }

            // Ensure alternation: Add only if it's different from the last
            if (deque.isEmpty() || deque.peekLast() != color) {
                deque.offerLast(color);
            } else {
                // If the new color is the same as the last one, restart the group
                deque.clear();
                deque.offerLast(color);
            }

            // Check if we formed a valid k-length alternating group
            if (deque.size() == k) {
                count++;
            }
        }
        return count;
    }
}
