class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int calculated = Arrays.stream(nums).sum();
        //expected sum should be 
        int expected = (n*(n+1))/2;
        return expected == calculated ? 0 : (expected - calculated);
    }
}