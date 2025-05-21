class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complementmap = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int num = nums[i];
            int complement = target - num;
            if(complementmap.containsKey(complement)){
                return new int[]{complementmap.get(complement),i};
            }
            complementmap.put(num,i);
        }
        return new int[0];
    }
}