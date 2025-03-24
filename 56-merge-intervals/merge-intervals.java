class Solution {
    public int[][] merge(int[][] intervals) {
        //sort intervals

        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        List<int[]> res = new ArrayList<>();
        boolean last = true;
        for(int j = 1; j < intervals.length; j ++){
            // if(j == intervals.length)
            int is = intervals[i][0];
            int ie = intervals[i][1];
            int js = intervals[j][0];
            int je = intervals[j][1];
            if(js <= ie){//merge case
                intervals[i][0] = Math.min(is,js);
                intervals[i][1] = Math.max(ie,je);
                if(j == intervals.length-1)
                    res.add(intervals[i]);
            }
            
            else{
                // append intevals at i
                // shift i  to j
                // if(j == intervals.length-1)

                res.add(intervals[i]);
                if(j == intervals.length-1){//last element did not merge
                    res.add(intervals[j]);
                }
                
                i = j;
            }
            
            
        }
        return res.toArray(new int[res.size()][]);
    }
}