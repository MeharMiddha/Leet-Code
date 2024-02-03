class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int matrix[][]=new int[rows*cols][2];
        int i=0;
        matrix[i++]=new int[]{rStart,cStart};
        int len=0;
        int dir=0;
        int direction[]=new int[]{0,1,0,-1,0};
        while(i<rows*cols){
            if(dir==0 || dir==2){
                len++;
            }
            for(int k=0;k<len;k++){
                rStart=rStart+direction[dir];
                cStart=cStart+direction[dir+1];
                if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0){
                    matrix[i++]=new int[]{rStart,cStart};
                }
            }

            dir=++dir%4;
        }
        return matrix;
    }
}
