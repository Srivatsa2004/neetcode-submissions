class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        if(len(numbers)<2):
            return false
        else:
            left =0
            right = len(numbers)-1

            while(left < right):
                current_sum = numbers[left] + numbers[right]
                if(current_sum == target):
                    return [left+1,right+1]
                
                elif(current_sum < target):
                    left += 1
                else:
                    right -= 1