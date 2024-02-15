class Solution {

    static int gcd(int n,int m){
        if(m==0){
            return n;
        }
        else{
            return gcd(m,n%m);
        }
    }

    public boolean isGoodArray(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res=gcd(res,nums[i]);
        }
        return res==1;
    }
}
