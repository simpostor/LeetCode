class Solution {
    public int numberOfSubstrings(String s) {
        //increment r while a b c is not valid
        //count += n - r
        //while valid shrink window by moving l and count += n -r each time  its valid
        //next iteration in outer while
        int n = s.length();
        int r = 0;
        int l = 0;
        int freq[] = new int[3];
        int count = 0;
        while(r < n){
            //
            char front = s.charAt(r);
            freq[front-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count += n - r;
                char back = s.charAt(l);
                freq[back-'a']--;
                l++;
            }
            r++;
        }
        return count;
    }
}