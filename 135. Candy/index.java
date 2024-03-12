import java.util.*;
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        if(n==1) return 1;
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1] && arr[i]<=arr[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && arr[i]<=arr[i+1]){
                arr[i]=arr[i+1]+1;
            }
        }
        int totalCandies=0;
        for(int i:arr){
            totalCandies+=i;
        }
        return totalCandies;
    }
}
