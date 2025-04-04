class Solution {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        int curr = first;
        for(int i = 0; i < n-1; i++ ){
            curr = first + second;
            first = second;
            second = curr;
        }
        return curr;
    }
}