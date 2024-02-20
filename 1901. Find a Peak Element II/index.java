class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int index1=0,index2=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    index1=i;
                    index2=j;
                }
            }
        }
        return new int[]{index1,index2};
    }
}
