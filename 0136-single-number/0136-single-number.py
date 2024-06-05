class Solution(object):
    def singleNumber(self, nums):
        result = 0
        for num in nums:
            result = result ^ num
        return result