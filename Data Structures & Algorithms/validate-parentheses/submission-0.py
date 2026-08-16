class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i in "({[":
                stack.append(i)
            elif not stack:
                return False
            else:
                top = stack.pop()
                if(top == '(' and i!=')' or top =='{' and i!='}' or top == '[' and i!=']'):
                    return False
        return not stack