class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int arr[]=new int[2];
        int sum=0;
        int start=0;
        int end=n-1;
        while(start<=end){
            sum=numbers[start]+numbers[end];
            if(sum==target){
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
            else if(sum>target){
                end=end-1;
            }
            else{
                start=start+1;
            }
        }
        return arr;
    }
}
