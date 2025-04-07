class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums) sum += num;
        if(sum % 2 != 0) return false;
        //now we know its even
        int target = sum/2;
        int n = nums.length;
        Boolean[][] dp = new Boolean[n+1][target+1];

        return helper(0,0, dp, nums,target);

    }
    public boolean helper(int i, int cursum, Boolean[][] dp, int[] nums, int target){
        if(cursum == target) return true;
        if(i == nums.length || cursum > target) return false;
        if(dp[i][cursum] == null){
            boolean take = helper(i+1, cursum + nums[i], dp, nums, target);
            boolean skip = helper(i+1, cursum, dp, nums, target);
            dp[i][cursum] = take || skip;
        }
        return dp[i][cursum];

    }
}