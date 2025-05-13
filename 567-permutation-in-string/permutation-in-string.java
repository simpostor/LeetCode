class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray())map.put(c,map.getOrDefault(c,0)+1);
        Map<Character,Integer> window = new HashMap<>();
        int l = 0;
        for(int r = 0; r<s2.length(); r++){
            if(map.equals(window))return true;//checking

            window.put(s2.charAt(r),window.getOrDefault(s2.charAt(r),0)+1);//adding

            if((r - l + 1) > s1.length()){//removing when bigger
                window.put(s2.charAt(l),window.get(s2.charAt(l))-1);
                if(window.get(s2.charAt(l))==0)window.remove(s2.charAt(l));
                l++;
            }
        }
        return (map.equals(window));
    }
}