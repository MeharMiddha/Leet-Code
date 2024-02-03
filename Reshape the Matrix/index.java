class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int k=mat[0].length;
        if (n * k != r * c) {
            return mat;
        }
        int arr[] = new int[n*k];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                arr[count]=mat[i][j];
                count++;
            }
        }
        int newMat[][] = new int[r][c];
        int index=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMat[i][j]=arr[index];
                index++;
            }
        }
        return newMat;
    }
}
