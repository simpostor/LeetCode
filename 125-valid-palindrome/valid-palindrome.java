class Solution {
    public boolean isPalindrome(String s) {
        int l = 0; int r = s.length()-1;
        if(s.length() == 1)return true;
        while(l<r){
            //skip till valid l
            //skip till valid r
            //compare and return false if not same
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            char charl = s.charAt(l);
            char charr = s.charAt(r);
            if(Character.toLowerCase(charr) != Character.toLowerCase(charl))
                return false;
            l++;r--;
        }
        return true;
    }
}