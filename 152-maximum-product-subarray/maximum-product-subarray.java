class Solution {
    public int maxProduct(int[] nums) {
        int curmax = 1;
        int curmin = 1;
        int maxprod = nums[0];
        for(int num : nums){
            int[] check = {curmax*num,curmin*num,num};
            curmax = Arrays.stream(check).max().getAsInt();

            curmin = Arrays.stream(check).min().getAsInt();
            maxprod = Math.max(maxprod,curmax);
        }
        return maxprod;
    }
}