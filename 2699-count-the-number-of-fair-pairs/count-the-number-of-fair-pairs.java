class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int locomp = lower - num;
            int hicomp = upper - num;
            //find index of firs element bigger tahn or equal to low comp
            //find first index of element smaller tahn or equal to hicomp
            int l = i+1; int r = n-1;
            
            while(l<=r){
                int m = (l+r)/2;
                if(nums[m] >= locomp){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
            if(l >= n || i == l)
                continue;
            int firstindex = l;
            l = i+1; r = n - 1;
            while(l<=r){
                int m = (l+r)/2;
                if(nums[m] <= hicomp){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
            if(r < 0 || r == i)
                continue;
            int lastindex = r;
            count += lastindex - firstindex + 1;
        }
        return count;
    }
}