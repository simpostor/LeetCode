class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){//while l is not letter or digit
                l++;
            }//now l at an index where char is letter or digit
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){//while l is not letter or digit
                r--;
            }// s at r has letter or digit
            if(Character.toUpperCase(s.charAt(r)) != Character.toUpperCase(s.charAt(l)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}