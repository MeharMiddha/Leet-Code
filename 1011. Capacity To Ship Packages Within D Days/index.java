class Solution {

    public static int checkDays(int[] weights,int max){
        int days=1,sum=0;
        for(int i:weights){
            if(sum+i>max){
                days=days+1;
                sum=i;
            }else{
                sum+=i;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE,sum=0;
        for(int i:weights){
            sum+=i;
            max=Math.max(i,max);
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(checkDays(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
