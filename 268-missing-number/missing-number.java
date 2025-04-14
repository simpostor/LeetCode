class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int calculated = 0;
        for(int num : nums)
            calculated += num;
        //expected sum should be 
        int expected = (n*(n+1))/2;
        return expected == calculated ? 0 : (expected - calculated);
    }
}