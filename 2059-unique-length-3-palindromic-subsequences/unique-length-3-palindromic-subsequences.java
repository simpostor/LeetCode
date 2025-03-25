class Solution {
    public int countPalindromicSubsequence(String s) {
        Map<Character, int[]> map = new HashMap<>();
        int count = 0;
        //find start end point of every char
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.putIfAbsent(c,new int[]{i,i});
            map.get(c)[1] = i;
        }
        //for every unique chae in string i have start and end point
        for(char key : map.keySet()){
            int start = map.get(key)[0];
            int end = map.get(key)[1];
            if(start == end)
                continue;//skipping if only one occurence
            Set<Character> unique = new HashSet<>();
            int i = start + 1;
            while(i < end){
                unique.add(s.charAt(i)); i++;
            }
            count += unique.size();//getting size of set for number of uniqu char between start and end 
        }
        return count;
    }

}