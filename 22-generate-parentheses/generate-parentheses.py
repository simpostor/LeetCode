class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack=[]
        res=[]
        def backtrack(closeN,openN):
            if closeN==openN==n:
                res.append("".join(stack))
                return
            if closeN<openN:
                stack.append(')')
                backtrack(closeN+1,openN)
                stack.pop()
            if openN<n:
                stack.append('(')
                backtrack(closeN,openN+1)
                stack.pop()
        backtrack(0,0)
        return res