class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int curr=1;curr<numRows;curr++){
            ans.add(new ArrayList<>());
            List<Integer> current = ans.get(curr);
            List<Integer> previous = ans.get(curr-1);
            current.add(1);
            for(int j=1;j<previous.size();j++){
                int sum = previous.get(j)+previous.get(j-1);
                current.add(sum);
            }
            current.add(1);
        }
        return ans;
        
    }
}
