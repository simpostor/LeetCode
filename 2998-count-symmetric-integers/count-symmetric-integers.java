class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int rescount = 0;
        for(int i = low; i <= high; i++){
            String num = Integer.toString(i);
            if(num.length() % 2 !=0)
                continue;
            int l = 0;
            int r = num.length()-1;
            int lsum = 0;
            int rsum = 0;
            while(l<r){
                lsum += num.charAt(l) - '0';
                rsum += num.charAt(r) - '0';
                l++;r--;
            }
            if(lsum == rsum)
                rescount++;
        }
        return rescount;
    }
}