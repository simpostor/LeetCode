class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;

        int leftZeros = 0;
        int rightOnes = 0;

        // Count total number of 1s for the right side
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') rightOnes++;
        }

        // Loop to find max score when splitting at i (0 to n-2)
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') leftZeros++;
            else rightOnes--;

            int score = leftZeros + rightOnes;
            max = Math.max(max, score);
        }

        return max;
    }
}
