class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxwater = 0;
        while(l < r){
            int water = (r-l)*(Math.min(height[l], height[r]));
            maxwater = Math.max(maxwater, water);
            if(height[l] <= height[r]){
                l++;
            }
            else
                r--;
        }
        return maxwater;
    }
}