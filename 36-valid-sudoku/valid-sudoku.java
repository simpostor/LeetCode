class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String,  Set<Character>> squares = new HashMap<>();


        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                char c = board[i][j];
                if(c == '.')
                    continue;
                String squarekey = i/3 +" "+ j/3;
                rows.putIfAbsent(i, new HashSet<>());
                cols.putIfAbsent(j, new HashSet<>());
                squares.putIfAbsent(squarekey, new HashSet<>());
                if(rows.get(i).contains(c) || cols.get(j).contains(c) || squares.get(squarekey).contains(c))//false if present
                    return false;
                else{
                    rows.get(i).add(c); cols.get(j).add(c); squares.get(squarekey).add(c);//add if not present
                }
            }
        }
        return true;
    }
}