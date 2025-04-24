class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count = 0;
        int n = nums.length;
        Set<Integer> set = new HashSet<>();//count unique in entire arr
        for(int num : nums)set.add(num);
        int targetsize = set.size();
        int l =0;
        int r = 0;

        Map<Integer,Integer> map = new HashMap<>();
        while(r < n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);//increased count
            
            while(l <= r && map.size() == targetsize){//found valid window now shrink
                count+=n-r;
                if(map.get(nums[l]) == 1)
                    map.remove(nums[l]);
                else
                    map.put(nums[l],map.get(nums[l]) - 1);
                l++;
            }
            r++;
        }
        return count;
    }
}