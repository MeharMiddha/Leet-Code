class Solution {

    public static boolean check(int n){
        int a=n;
        int length=0;
        while(a!=0){
            length++;
            a=a/10;
        }
        if(length%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(check(nums[i])){
                count++;
            }
        }
        return count;
    }
}
