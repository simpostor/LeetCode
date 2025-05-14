class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = 0;
        int r = m-1;
        if(target < matrix[0][0]||target>matrix[m-1][n-1])return false;
        while(l<=r){
            int mid = (l+r)/2;
            // check if matrix at mid arr has our num
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]){
                int lo = 0;
                int hi = n-1;
                while(lo <= hi){
                    int med = (lo+hi)/2;
                    if(matrix[mid][med] == target) return true;
                    else if(target < matrix[mid][med]) hi = med - 1;
                    else lo = med + 1;
                }
                //not found in the arr where it should ahve been so its false
                return false; 
            }
            //other two cases if target smaller than firs index in curr arr | if target > last index in cur arr
            else if(target < matrix[mid][0]) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }
}