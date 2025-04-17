class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
        //we have freq of every num
        for(int num : map.keySet()){
            int freq = map.get(num);
            int n2 = Math.abs(k - num);
            int combinations = 0;
            // if((Math.abs(num-n1) == k) && (map.containsKey(n1))){
            //     combinations = map.get(num) * map.get(n1);
            // }
            if((Math.abs(num-n2) == k) && (map.containsKey(n2))){
                combinations = map.get(num) * map.get(n2);
            }
            count += combinations;
        }
        return  count;
    }
}