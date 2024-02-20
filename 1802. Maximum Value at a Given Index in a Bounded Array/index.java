class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int res=1;
        maxSum=maxSum-n;
        int left=0;
        int maxLeft = index;
        int maxRight = n-index-1;
        int right=0;
        while(maxSum>0){
            res++;
            int leftVal = Math.min(left++,maxLeft);
            int rightVal = Math.min(right++,maxRight);
            maxSum=maxSum-(1+leftVal+rightVal);

            if(leftVal==maxLeft && rightVal==maxRight){
                break;
            }
        }

        if(maxSum>0){
            res=res+(maxSum/n);
        }
        return (maxSum<0) ? res-1 : res;

    }
}
