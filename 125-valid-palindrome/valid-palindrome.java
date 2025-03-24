class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        return recursion(s,l,r);
    }
    public boolean recursion(String s , int l, int r){
        while(l<r && !(Character.isLetterOrDigit(s.charAt(l)))){
            l++;
        }
        while(l<r && !(Character.isLetterOrDigit(s.charAt(r)))){
            r--;
        }
        if(l>=r)
            return true;//base case
        if(Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r)))
            return false;//false case
        else
            return recursion(s,l+1,r-1);//move to next depth
    }
}