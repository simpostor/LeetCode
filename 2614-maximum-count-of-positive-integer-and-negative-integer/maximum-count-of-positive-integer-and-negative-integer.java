class Solution {
    public int maximumCount(int[] nums) {
        int l = 0;
        int r  = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]<=0){
                l = m + 1;
            }
            else if(nums[m]>0){
                r = m - 1;
            }
        }
        //l is at first postive index
        int posindex = l;
        l = 0;
        r = nums.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]>=0){
                r = m - 1;
            }
            else if(nums[m] < 0)
            l = m + 1;

        }
        int negindex = r;
        return Math.max((nums.length-posindex),(negindex+1));
    }
}