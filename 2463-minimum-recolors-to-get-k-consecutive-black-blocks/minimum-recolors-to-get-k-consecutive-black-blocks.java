class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        // Count white blocks in the first window of size k.
        int countWhite = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                countWhite++;
            }
        }
        int minRecolors = countWhite;
        
        // Slide the window across the string.
        for (int i = k; i < n; i++) {
            // Add the new block at the right end.
            if (blocks.charAt(i) == 'W') {
                countWhite++;
            }
            // Remove the leftmost block of the previous window.
            if (blocks.charAt(i - k) == 'W') {
                countWhite--;
            }
            minRecolors = Math.min(minRecolors, countWhite);
        }
        
        return minRecolors;
    }
}
