class Solution {
    public String rankTeams(String[] votes) {
        int voteslen = votes[0].length();
        int[][] map = new int[26][voteslen+1];
        //now fill this maps every rows last index with i so taht we knoe whcih char it is
        for(int i = 0; i < map.length; i++)
            map[i][voteslen] = i;
        //now we can fill the map with counts
        for(int i = 0; i < votes.length; i ++){
            String s = votes[i];
            for(int j = 0; j < s.length(); j++){
                map[s.charAt(j)-'A'][j]++;
            }
        }
        //now we can sort
        // Arrays.sort(map, (a,b) -> {
        //     for(int i = 0; i < voteslen; i++){
        //         int cmp = Integer.compare(a[i],b[i]);
        //         if(cmp!=0)
        //             return cmp;
        //     }
        //     return 0;
        // });
        Arrays.sort(map, (a, b) ->{
            for(int i = 0; i < voteslen; i++){
                if(a[i] < b[i]) return 1;
                if(a[i] > b[i]) return -1;
            }
            return 0;
        });
        //after sort mabke sb
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < voteslen; i++){
            int val = map[i][voteslen];
            char c = (char) (val + 'A');
            sb.append(c);
        }
        return sb.toString();

    }
}