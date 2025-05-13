class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxlen = 0;
        int maxfreq = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int r = 0; r < s.length(); r++){
            //add char at r
            //compare max freq and update if required
            //remove char at l till window is invalid - taht is windo - maxfreq is less than or equal to k
            //if valid caompare with max len and update if required
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            maxfreq = Math.max(maxfreq,map.get(s.charAt(r)));
            
            while((r-l+1)-maxfreq > k){
                //remove cahr at l
                map.put(s.charAt(l),map.get(s.charAt(l))-1);l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
        }
        return maxlen;
    }
}