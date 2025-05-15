class Solution {
    public int removeElement(int[] nums, int val) {
        int tail = 0;
        for(int head = 0; head < nums.length; head++){
            if(nums[head] != val){
                nums[tail] = nums[head];
                tail++;
            }
        }
        return tail;
    }
}