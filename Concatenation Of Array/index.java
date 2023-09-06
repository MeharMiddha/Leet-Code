class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int count=0;
        for(int i=n;i<2*n;i++){
            arr[i]=nums[count];
            count++;
        }
        return arr;
    }
}
