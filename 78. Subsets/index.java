class Solution {
    public static void solve(int[] nums,int index, List<Integer> output, List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        // exclude
        solve(nums,index+1,output,ans);
        // include
        int element=nums[index];
        output.add(element);
        solve(nums,index+1,output,ans);
        output.remove(output.size()-1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,index,output,ans);
        return ans;
    }
}
