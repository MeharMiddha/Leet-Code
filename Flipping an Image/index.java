class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int arr[][]=new int[n][n];
        int k=0,l=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                arr[i][j]=image[k][l];
                l++;
            }
            k++;
            l=0;
        }
        int arrf[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    arrf[i][j]=1;
                }
                else{
                    arrf[i][j]=0;
                }
            }
        }
        return arrf;
    }
}
