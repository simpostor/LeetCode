class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int second = 0;
        int first = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            int cur = Math.max(second + nums[i], first);
            second = first;
            first = cur;
            
        }
        return first;
    }
}