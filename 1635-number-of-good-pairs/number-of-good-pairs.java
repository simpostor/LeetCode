class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums )map.put(num,map.getOrDefault(num,0)+1);
        for(int num : map.keySet()) count+= (map.get(num)*(map.get(num)-1))/2;
        return count;
    }
}