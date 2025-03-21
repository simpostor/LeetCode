class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i = 0; i < n; i++){
            char first = word1.charAt(i);
            char second = word2.charAt(i);
            sb.append(first);
            sb.append(second);
        }
        //i is at index out of range for one word
        while(i < word1.length()){
            char first = word1.charAt(i);
            sb.append(first);
            i++;
        }
        while(i < word2.length()){
            char second = word2.charAt(i);
            sb.append(second);
            i++;
        }
        return sb.toString();
    }
}