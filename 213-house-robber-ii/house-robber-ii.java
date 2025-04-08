class Solution {
    public int rob(int[] nums) {
        if(nums.length <= 2){
            return Arrays.stream(nums).max().getAsInt();
        }
        int n = nums.length;
        return Math.max( helper(nums,0,n-2), helper(nums,1,n-1));

    }
    public int helper(int[] nums, int start, int end){
        int second = 0;
        int first = nums[end];
        for(int i = end-1; i >= start; i--){
            int cur = Math.max(nums[i]+second,first);
            second = first;
            first = cur;
        }
        return first;
    }
}