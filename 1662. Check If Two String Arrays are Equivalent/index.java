class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sb="";
        String ans="";
        for(String t:word1){
            sb+=t;
        }
        for(String s:word2){
            ans+=s;
        } 
        return sb.equals(ans);
    }
}
