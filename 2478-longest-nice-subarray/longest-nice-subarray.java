class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int sum = 0;
        int xorsum = 0;
        int max = 0;
        for(int r = 0; r < nums.length; r++){
            //add num in window
            int curnum = nums[r];
            sum += curnum;
            xorsum = xorsum ^ curnum;
            while(! (sum == xorsum)){//remove l elements from window if xorsum != sum
                int end = nums[l];
                sum -= end;
                xorsum = xorsum ^ end;
                l++;
                //rmeoved from both
            }
            //now we knoe sum ==  xorum so check window size max
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}