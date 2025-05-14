class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int m = (l+r)/2;
            if(nums[l]<=nums[m]){//left sub array is sorted comapre with its min adn go to right sub
                min = Math.min(nums[l],min);
                l = m + 1;
            }
            else{//if right sub is sorted comapre with its min and go to left sub 
                min = Math.min(nums[m],min);
                r = m - 1;
            }
        }
        return min;
    }
}