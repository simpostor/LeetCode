class Solution {
    public int minOperations(int[] nums) {
        int flipcount = 0;
        for(int i = 0; i <= nums.length-3; i++){
            if(nums[i]==0){
                //flip curr and next two nums
                flipcount++;
                flip(nums,i);
                flip(nums,i+1);
                flip(nums,i+2);
            }
        }
        boolean valid = true;
        for(int num : nums){
            if(num!=1){
                valid = false;
                break;
            }
        }
        if(valid){
            return flipcount;
        }
        else
            return -1;
    }
    public void flip(int[]nums, int pos){
        if(nums[pos] == 1)
            nums[pos] = 0;
        else
            nums[pos] = 1;
        return;
    }
}