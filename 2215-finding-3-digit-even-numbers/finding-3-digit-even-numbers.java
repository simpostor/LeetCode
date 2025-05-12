class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;
        for(int i = 0; i < n; i++){
            if(digits[i] == 0)continue;
            for(int j = 0; j < n; j++){
                if(j==i)continue;
                for(int k = 0; k < n; k++){
                    if(k==i||k==j||digits[k]%2!=0)continue;
                    String num = digits[i]+""+digits[j]+""+digits[k];
                    set.add(Integer.parseInt(num));
                }
            }
        }
        n = set.size();
        int[] res = new int[n];
        int i = 0;
        for(int num : set){
            res[i] = num;i++;
        }
        Arrays.sort(res);
        return res;
    }
}