class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);//count freq
        }
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(freq%2 != 0)
                return false;
        }
        return true;
    }
}