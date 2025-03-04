class Solution {
    public boolean checkPowersOfThree(int n) {
        String ternary = Integer.toString(n, 3);
        for(int i = 0; i < ternary.length(); i++){
            if(ternary.charAt(i) == '2')
                return false;
        }
        return true;
    }
}