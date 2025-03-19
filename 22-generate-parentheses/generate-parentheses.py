class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack=[]
        res=[]
        def backtrack(closeN,openN):
            if closeN==openN==n:#base case
                res.append("".join(stack))
                return
            if openN<n:#open bracket whenever open < n
                stack.append('(')
                backtrack(closeN,openN+1)
                stack.pop()
            if closeN<openN: # close braket only when close less than open
                stack.append(')')
                backtrack(closeN+1,openN)
                stack.pop()
            
        backtrack(0,0)
        return res