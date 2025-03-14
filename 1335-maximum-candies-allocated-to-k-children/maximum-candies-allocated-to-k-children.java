class Solution {
    public int maximumCandies(int[] candies, long k) {
        //min maxCandies can be 0 and max maxCandies can be max of candies
        //if sum of candies[i] < k then return 0
        long sum = 0;
        int r = 0;
        for(int candy : candies){
            sum += candy;//we can check if we have to return zero
            r = Math.max(r,candy);//we get r val
        }
        if(sum < k)
            return 0;
        //now run bin search from 1 - r
        int l = 1;
        int maxCandies = 0;
        while(l<=r){
            int m = (l + r)/2;
            //now check if we can distirbute m candies in more than k child
            //if yes maxCandies update and l = m  + 1
            //else r = m - 1;
            long child = 0;
            for(int candy : candies){
                child += (candy/m);
            }
            if(child >= k){
                maxCandies = Math.max(maxCandies,m);
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return maxCandies;
        
    }
}