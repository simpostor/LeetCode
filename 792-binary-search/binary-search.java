class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target,0,nums.length-1);
    }
    public int binary(int[] nums, int target, int l, int r){
        if(l>r) return -1;
        int m = (l+r)/2;
        if(nums[m] == target) return m;//base case
        else if(target < nums[m]) return binary(nums,target,l,m-1);
        else return binary(nums,target,m+1,r);
    }
}