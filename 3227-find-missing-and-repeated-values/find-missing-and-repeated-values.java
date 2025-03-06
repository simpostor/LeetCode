class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        int sum = 0;
        for(int i = 0; i <n; i++ ){
            for(int j = 0; j < n; j++){
                int num = grid[i][j];
                if(set.contains(num))
                    res[0] = num;
                set.add(num);
                sum += num;
            }
        }
        n *= n;
        int expected = n*(n+1)/2;
        res[1] = expected - (sum - res[0]);
        return res;
        //all elements in set and we know repeated elemnt a well
    }
}