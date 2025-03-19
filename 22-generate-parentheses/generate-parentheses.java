class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;
        backtrack(sb,res,n,open,close);
        return res;

    }
    public void backtrack(StringBuilder sb, List<String> res, int n, int open, int close){
        if(open == n && open == close){
            res.add(sb.toString());
            return;
        }
        if(open < n){
            sb.append('(');
            backtrack(sb,res,n,open+1,close);
            sb.deleteCharAt(sb.length()-1);//backtrakcing
        }
        if(open > close){
            sb.append(')');
            backtrack(sb, res, n, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}