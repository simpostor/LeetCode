class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            //while char at r in set minimize window
            //add r
            //compare size
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            longest = Math.max(longest,(r-l+1));
        }
        return longest;
    }
}