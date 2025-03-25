class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        //make x cord array and y cords array
        int[][] x_cords = new int[rectangles.length*2][2];
        int[][] y_cords = new int[rectangles.length*2][2];
        for(int i = 0 ; i < rectangles.length; i++){
            int[] rectangle = rectangles[i];
            int rec = i + 1;
            int first = (rec*2)-2;
            int second = (rec*2)-1;
            x_cords[first][0] = rectangle[0];
            x_cords[first][1] = 1;
            x_cords[second][0] = rectangle[2];
            x_cords[second][1] = 0;

            y_cords[first][0] = rectangle[1];
            y_cords[first][1] = 1;
            y_cords[second][0] = rectangle[3];
            y_cords[second][1] = 0;

        }
        // now we can sort x cords and then iterate then sort y cords and iterate
        
        Arrays.sort(x_cords, (a,b) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        Arrays.sort(y_cords, (a,b) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        //iterate in x_cords len same as y cords len
        int xcount = 0;
        int ycount = 0;
        int cutx = 0;
        int cuty = 0;
        for(int i = 0; i < x_cords.length; i++){
            int[] x = x_cords[i];
            int[] y = y_cords[i];
            if(x[1] == 1){//curr x cord has starting cord
                xcount++;
            }
            else{
                xcount--;
                if(xcount == 0)
                    cutx++;
            }
            if(y[1] == 1){//curr y cord has starting cord
                ycount++;
            }
            else{
                ycount--;
                if(ycount == 0)
                    cuty++;
            }

        }
        if(cutx >= 3 || cuty >= 3)
            return true;
        return false;
    }
}