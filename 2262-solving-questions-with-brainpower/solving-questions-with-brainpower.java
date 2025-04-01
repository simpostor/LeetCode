class Solution {
    public long mostPoints(int[][] questions) {
        int points = 0;
        int i = 0;
        long[] memo = new long[questions.length];
        Arrays.fill(memo,-1);
        return recursion(questions, i, memo);
    }
    public long recursion(int[][] questions, int i, long[] mem){
        int n = questions.length;
        if(i >= n){//base case
            return 0;
        }
        if(mem[i] != -1){
            return mem[i];
        }
        long skip = recursion(questions, i+1,mem);
        //solve
        long solve = questions[i][0] + recursion(questions, i+questions[i][1]+1, mem);
        mem[i] = Math.max(skip, solve);
        return Math.max(skip, solve);
        
    }
}