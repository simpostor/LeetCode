class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();

        for (int i = 0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            smap.put(cs,smap.getOrDefault(cs,0)+1);
            tmap.put(ct,tmap.getOrDefault(ct,0)+1);
        }
        return smap.equals(tmap);
    }
}