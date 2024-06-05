class Solution(object):
    def sortColors(self, nums):
        r, w, b = 0, 0, len(nums) - 1
    
        while w <= b:
            if nums[w] == 0:
                nums[r], nums[w] = nums[w], nums[r]
                r += 1
                w += 1
            elif nums[w] == 1:
                w += 1
            else:
                nums[w], nums[b] = nums[b], nums[w]
                b -= 1

# Test the function
nums = [2, 0, 2, 1, 1, 0]
Solution().sortColors(nums)
print(nums)  # Output: [0, 0, 1, 1, 2, 2]