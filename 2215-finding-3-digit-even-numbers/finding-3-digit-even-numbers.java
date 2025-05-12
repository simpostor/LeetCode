class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int digit : digits)map.put(digit,map.getOrDefault(digit,0)+1);
        for(int i = 100; i < 999; i++){
            if(i % 2 != 0)continue;
            if(isValid(i,map))list.add(i);
        }
        int n = list.size();
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public boolean isValid(int num, Map<Integer,Integer> map){
        Map<Integer,Integer> nummap = new HashMap<>();
        while(num != 0){
            int digit = num%10;
            nummap.put(digit,nummap.getOrDefault(digit,0)+1);
            num /= 10;
        }
        for(int n : nummap.keySet()){
            int freq = nummap.get(n);
            if((!map.containsKey(n)) || (freq > map.get(n)))return false;
        }
        return true;//if we go through for and dont get false then its true
    }
}