class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char prev = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            char curr = s.charAt(i);
            score += Math.abs(prev - curr);
            prev = curr;
        }
        return score;
    }
}