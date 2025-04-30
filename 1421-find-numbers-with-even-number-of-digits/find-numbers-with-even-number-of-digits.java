class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
        for(int num : nums){
            int digit = 0;
            int number = num;
            while(number>0){
                number /= 10;
                digit++;
            }
            if(digit%2 == 0)
                evencount++;
        }
        return evencount;
    }
}