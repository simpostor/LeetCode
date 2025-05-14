class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int resspeed = r;
        while(l <= r){
            int speed = (l+r)/2;
            long hrs = countHours(piles,speed);
            
            if(hrs > h){
                l = speed+1;
            }
            else{
                //if hrs = or less than h then take min of res speed and calculated speed
                resspeed = speed;
                r = speed-1;
            }
        }
        return resspeed;
    }
    public long countHours(int[] piles, int speed){
        long hours = 0;
        for(int pile : piles){
            hours += (pile+speed-1)/speed;
        }
        return hours;
    }
}