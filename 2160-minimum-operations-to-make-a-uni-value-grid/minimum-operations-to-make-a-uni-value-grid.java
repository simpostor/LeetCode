class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] list = new int[n*m];
        int counter = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j ++){
                list[counter++] = grid[i][j];
            }
        }
        int count = 0;
        Arrays.sort(list);
        int median = list.length/2;
        int target = list[median];
        int l = 0;
        int r = list.length-1;
        while(r != median){
            int countl = countoperation(list[l], target, x);
            int countr = countoperation(list[r], target, x);
            if(countl == -1 || countr == -1)
                return -1;
            count+= countl;
            count += countr;
            l++;r--;
        }
        if(list.length%2 == 0){
            count += countoperation(list[l], target, x);
        }
        return count;

    }
    public int countoperation(int num, int target, int x){
        if((target - num) % x == 0){
            return Math.abs(num-target) / x ;
        }
        else return -1;
    }

}