class Solution {
    public int countDays(int days, int[][] meetings) {
        int[][] merged = merge(meetings);
        for(int[] meeting : merged){
            days = days - (meeting[1]-meeting[0]+1);
        }
        return days;

    }
    public int[][] merge(int[][] intervals){
        List<int[]> res = new ArrayList<>();
        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));//sort as per start
        int i = 0;
        for(int j = 1; j < intervals.length; j++){
            if(intervals[j][0] <= intervals[i][1]){//merge
                intervals[i][0] = Math.min(intervals[i][0],intervals[j][0]);
                intervals[i][1] = Math.max(intervals[i][1],intervals[j][1]);
                if(j == intervals.length -1)
                    res.add(intervals[i]);
            }
            else{
                res.add(intervals[i]);
                i = j;
                if(j == intervals.length-1){//last element did not merge
                    res.add(intervals[j]);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}