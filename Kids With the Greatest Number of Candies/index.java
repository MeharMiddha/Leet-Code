class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bool = new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        int flag;
        for(int i=0;i<n;i++){
            max=candies[i]+extraCandies;
            flag=1;
            for(int j=0;j<n;j++){
                if(max<candies[j]){
                    flag=0;
                }
            }
            if(flag==0){
                bool.add(false);
            }
            else{
                bool.add(true);
            }
        }
        return bool;
    }
}
