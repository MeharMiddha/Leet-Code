// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
import java.util.*;
public class spiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int m=n;
        int top=0,bottom=n-1;
        int left=0,right=m-1;
        int count=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=count++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=count++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=count++;
                }
                left++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
