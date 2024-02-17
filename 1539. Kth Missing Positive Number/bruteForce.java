class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int max=arr[n-1];
        int count=0;
        int iter=0;
        int ans=0;
         for (int i = 1; i <= max + k; i++) {
            if (iter < n && i == arr[iter]) {
                iter++;
            } else {
                count++;
                if (count == k) {
                    ans = i;
                    break; 
                }
            }
        }
        if(ans>0){
            return ans;
        }else{
            return max+k;
        }
    }
}
