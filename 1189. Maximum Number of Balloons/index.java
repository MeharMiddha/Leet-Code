class Solution {
    public int maxNumberOfBalloons(String text) {
        int frequency[]=new int[26];
        for(char c:text.toCharArray()){
            frequency[c-'a']++;
        }
        char balloon[]=new char[]{'b','a','l','o','n'};
        int min=Integer.MAX_VALUE;
        for(char c:balloon){
            if(c=='l' || c=='o') frequency[c-'a']=frequency[c-'a']/2;
            min=Math.min(frequency[c-'a'],min);
        }
        return min==Integer.MAX_VALUE ? 0:min;
    }
}
