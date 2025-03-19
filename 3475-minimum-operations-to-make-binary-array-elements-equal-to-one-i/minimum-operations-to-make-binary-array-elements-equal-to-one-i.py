class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        count = 0
        for i in range(n-2):
            if nums[i] == 0:
                count += 1
                self.flip(nums,i)
                self.flip(nums,i+1)
                self.flip(nums,i+2)
        valid = True
        for i in range(n):
            if nums[i] == 0:
                valid = False
                break
        if valid:
            return count
        else:
            return -1

    def flip(self, nums:List[int],pos) -> None:
        if nums[pos] == 1:
            nums[pos] = 0
        else:
            nums[pos] = 1
                
        