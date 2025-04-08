class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixsum = new int[n];
        String vowel = "aeiou";
        int vowelcount = 0;

        for (int i = 0; i < n; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (vowel.indexOf(first) != -1 && vowel.indexOf(last) != -1) {
                vowelcount++;
            }
            prefixsum[i] = vowelcount;
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = prefixsum[end] - (start > 0 ? prefixsum[start - 1] : 0);
        }

        return res;
    }
}
