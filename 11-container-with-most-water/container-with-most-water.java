class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int breadth = Math.min(height[l],height[r]);
            int len = r - l;
            int vol = len*breadth;
            max = Math.max(max,vol);
            while(l<r && height[l]<=breadth)l++;
            while(l<r && height[r]<=breadth)r--;
        }
        return max;
    }
}