class Solution {
    public char findTheDifference(String s, String t) {
        char sArray[]=s.toCharArray();
        char tArray[]=t.toCharArray();
        int i;
        int sSum=0;
        int tSum=0;
        for(i=0;i<tArray.length;i++){
            tSum+=tArray[i];
        }
        for(i=0;i<sArray.length;i++){
            sSum+=sArray[i];
        }
        return (char)((tSum-sSum));
    }
}
