class Solution {
    public int waysToSplitArray(int[] nums) {
        long suffix = 0;
        for(int i = nums.length-1; i >= 1; i--){//populate suffix array with sum of suffix
            suffix += nums[i];
        }
        long prefix = 0;
        int res = 0;
        for(int i = 0; i < nums.length-1; i++){
            prefix += nums[i];
            if(prefix >= suffix)
                res++;
            suffix -= nums[i+1];
        }
        return res;
    }
}