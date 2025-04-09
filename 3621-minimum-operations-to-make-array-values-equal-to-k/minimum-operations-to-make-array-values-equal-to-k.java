class Solution {
    public int minOperations(int[] nums, int k) {
        int[] hashtable = new int[101];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            if(nums[i] < k)
                return -1;//we know only valid cases remain after this
            hashtable[num]++;//count all nums occurunces
        }
        int count = 0;
        int lastnum = 0;
        for(int i = 100; i >= 0; i--){
            if(hashtable[i] == 0)
                continue;
            count++;
            lastnum = i;
        }
        if(lastnum == k)
            count--;

        return count;
    }
}