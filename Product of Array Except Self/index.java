class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        if(n<1){
            return arr;
        }
        int product=1;
        for(int i=0;i<n;++i){
            product*=nums[i];
            arr[i]=product;
        }
        product=1;
        for(int i=n-1;i>0;--i){
            arr[i]=arr[i-1]*product;
            product*=nums[i];
        }
        arr[0]=product;
        return arr;
    }
}
