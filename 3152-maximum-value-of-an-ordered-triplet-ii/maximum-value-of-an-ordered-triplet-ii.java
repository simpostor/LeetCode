class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = Math.max(prefix[i-1],nums[i]);
        }
        long[] suffix = new long[n];
        suffix[n-1] = nums[n-1];
        for(int i = n-2; i >=0; i--){
            suffix[i] = Math.max( suffix[i+1] , nums[i]);

        }
        for(int i = 1; i < n-1; i ++){
            max = Math.max(max, (prefix[i-1]-nums[i])*suffix[i+1]);
        }
        return max;
    }
}