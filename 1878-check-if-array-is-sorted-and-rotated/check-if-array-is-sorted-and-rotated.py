class Solution(object):
    def check(self, nums):
        count = 0
        n = len(nums)
        for i in range(1, n):
            if nums[i - 1] > nums[i]:
                count += 1
        if count > 1:
            return False
        if nums[n - 1] > nums[0] and count != 0:
            return False
        return True
        """
        :type nums: List[int]
        :rtype: bool
        """

        