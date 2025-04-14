class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(i >= j || j >= k)
                        continue;
                    int one = Math.abs(arr[i]-arr[j]);
                    int two = Math.abs(arr[j]-arr[k]);
                    int three = Math.abs(arr[k]-arr[i]);
                    if(one <= a && two <= b && three <=c)
                        count++;

                }
            }
        }
        return count;
    }
}