class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=nums[i];
        }
        int count=0;
        int arr2[]=new int[a-n];
        for(int i=n;i<a;i++){
            arr2[count]=nums[i];
            count++;
        }
        int arrFinal[]=new int[a];
        int index=0;
        int ind=0;
        for(int j=0;j<a;j++){
            if(j%2==0){
                arrFinal[j]=arr[index];
                index++;
            }
            else{
                arrFinal[j]=arr2[ind];
                ind++;
            }
        }
        return arrFinal;
    }
}
