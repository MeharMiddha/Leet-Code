class Solution {
    public static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int count=0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=count+low;
        int temp=arr[pivotIndex];
        arr[pivotIndex]=arr[low];
        arr[low]=temp;
        int i=low,j=high;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int a = arr[i];
                arr[i]=arr[j];
                arr[j]=a;
                i++;j--;
            }
        }
        return pivotIndex;
    }

    public static void solve(int[] arr, int low, int high){
        if(low>=high) return;
        int p = partition(arr,low,high);
        solve(arr,low,p-1);
        solve(arr,p+1,high);
    }

    public int[] sortArray(int[] nums) {
        solve(nums,0,nums.length-1);
        return nums;
    }
}
