class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int n = nums.size();
        int l = 0, r = n - 1;
        // Find the first index with a positive number
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] <= 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int posCount = n - l;
        
        // Find the last index with a negative number
        l = 0;
        r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        int negCount = r + 1;
        
        return max(posCount, negCount);
    }
};
