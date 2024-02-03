class Solution {
    public static boolean checkMax(int ele,int matrix[][],int index){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(ele<matrix[i][index]){
                return false;
            }
        }
        return true;
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min;
        int n=matrix.length;
        int index=-1;
        for(int i=0;i<n;i++){
            min=Integer.MAX_VALUE;
            int m=matrix[i].length;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            if(checkMax(min,matrix,index)){
                list.add(min);
            }
        }
        return list;
    }
}
