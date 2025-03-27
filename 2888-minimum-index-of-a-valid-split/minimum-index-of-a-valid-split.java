class Solution {
    public int minimumIndex(List<Integer> nums) {
        int max = 0;
        int maxelement = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            int num = nums.get(i);
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > max){
                max = map.get(num);
                maxelement = num;
            }
        }

        
        int leftm = 0;
        int leftt = 0;
        int rightm = max;
        int rightt = nums.size(); 
        
        for(int i = 0; i < nums.size(); i++){
            leftt++;
            rightt--;
            if(nums.get(i) == maxelement){
                rightm--;
                leftm++;

            }
            boolean isvalidleft = leftm> (leftt/2);
            boolean isvalidright = rightm> (rightt/2);
            if(isvalidright && isvalidleft)
                return i;
        }
        return -1;
    }
}