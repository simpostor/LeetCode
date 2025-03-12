from typing import List

class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        # Find the first index with a positive number
        while l <= r:
            m = (l + r) // 2
            if nums[m] <= 0:
                l = m + 1
            else:
                r = m - 1
        posCount = len(nums) - l
        
        l, r = 0, len(nums) - 1
        # Find the last index with a negative number
        while l <= r:
            m = (l + r) // 2
            if nums[m] < 0:
                l = m + 1
            else:
                r = m - 1
        negCount = r + 1
        
        return max(posCount, negCount)
