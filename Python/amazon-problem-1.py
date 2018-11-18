# From Ben
class Solution:
    def countKDistinctSubstrings(self, inputString, num):
        i = 0
        while i < len(inputString):
            print(inputString[0])
            i += i+1


test = Solution()  # Create a solution object
# Used for testing with custom inputs
test.countKDistinctSubstrings("hiejr", 2)
