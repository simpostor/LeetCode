class Solution {
    public int numRabbits(int[] answers) {
        //counter map
        int rabbitcount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ans  : answers) map.put(ans,map.getOrDefault(ans,0)+1);
        //we have counted all ans now iterate throu keyset
        for(int ans : map.keySet()){
            int count = map.get(ans);
            int grpcount = count/(ans+1);
            if(count%(ans+1) != 0)
                grpcount += 1;
            rabbitcount += (ans+1)*grpcount;
        }
            return rabbitcount;
    }
}