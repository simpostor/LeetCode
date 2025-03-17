class Solution {
    public boolean divideArray(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        int[] map = new int[501];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            map[num]++;
        }
        for(int freq : map){
            if(freq%2 != 0)
                return false;
        }
        return true;
    }
}