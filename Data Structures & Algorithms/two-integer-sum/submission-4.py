class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indexAndValue = {}

        for i, n in enumerate(nums):
            indexAndValue[n] = i 

        for i, n in enumerate(nums):
            goal = target - n
            if goal in indexAndValue and indexAndValue[goal] != i:
                return [i, indexAndValue[goal]]