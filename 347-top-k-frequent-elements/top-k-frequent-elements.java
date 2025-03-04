class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        //we have mapped cout of each num now we do bucket sort
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        //now for loop backwards in bucekt 
        int[] res = new int[k];
        int count = 0;
        for(int i = bucket.length-1; i >=0 && count<k; i--){
            if(bucket[i] != null){
                for(Integer integer : bucket[i]){
                    res[count++] = integer;
                }
            }
        }
        return res;
    }
}