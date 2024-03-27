class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        for(String word:word1){
            str1+=word;
        }
        for(String w:word2){
            str2+=w;
        }
        if(str1.equals(str2)) return true;
        return false;
    }
}
