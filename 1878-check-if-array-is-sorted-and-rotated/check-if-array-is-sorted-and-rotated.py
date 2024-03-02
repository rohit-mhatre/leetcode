class Solution(object):
    def check(self, nums):
        count = 0
        length = len(nums) - 1
        for i in range (0,length):
            if nums[i] > nums[i+1]:
                count += 1
        if count > 1 or (count == 1 and nums[0] < nums[length]):
            return False
        return True
        """
        :type nums: List[int]
        :rtype: bool
        """

        