/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    let l = 0, r = nums.length - 1;
    // Find the first index with a positive number
    while (l <= r) {
        let m = Math.floor((l + r) / 2);
        if (nums[m] <= 0) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }
    // Number of positives
    let posCount = nums.length - l;
    
    // Find the last index with a negative number
    l = 0;
    r = nums.length - 1;
    while (l <= r) {
        let m = Math.floor((l + r) / 2);
        if (nums[m] < 0) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }
    // Number of negatives
    let negCount = r + 1;
    
    return Math.max(posCount, negCount);
};
