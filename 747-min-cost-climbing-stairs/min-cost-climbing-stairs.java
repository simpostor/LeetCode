class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length+1;
        int second = 0;
        int first = cost[n-2];
        
        for(int i = n-3; i >= 0; i--){
            int curcost = cost[i] + Math.min(first,second);
            second = first;
            first = curcost;
            
        }
        return Math.min(first,second);
    }
}