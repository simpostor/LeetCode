class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxwater = 0;
        while(l < r){
            int len = r-l;
            int breadth = (Math.min(height[l], height[r]));
            int water = len*breadth;
            maxwater = Math.max(maxwater, water);
            while(l<r && height[l] <= breadth){
                l++;
            }
            while(l<r && height[r] <= breadth)
                r--;
        }
        return maxwater;
    }
}