class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int[] prev = points[0];
        for(int i = 1; i < points.length; i++){
            int[] curr = points[i];
            time += travel(prev,curr);
            prev[0] = curr[0];
            prev[1] = curr[1];
        }
        return time;
    }
    public int travel(int[] start, int[] end){
        int x1 = start[0];
        int y1 = start[1];
        int x2 = end[0];
        int y2 = end[1];
        return Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
    }
}