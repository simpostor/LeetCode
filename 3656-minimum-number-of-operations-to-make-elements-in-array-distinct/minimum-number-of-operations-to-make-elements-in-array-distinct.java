class Solution {
    public int minimumOperations(int[] nums) {
        int l = 0;
        int r = 0;
        int ops = 0;
        Set<Integer> set = new HashSet<>();
        while(r < nums.length){
            while(r < nums.length && set.contains(nums[r])){
                ops++;
                for(int i = 0; i < 3; i++){
                    if(l < nums.length && set.contains(nums[l]))
                        set.remove(nums[l]);
                    l++;
                }
                r = Math.max(l,r);
            }
            if(r < nums.length){
                set.add(nums[r]);
                r++;
            }
            
        }
        return ops;
    }
}