class Solution {
    boolean[][] dp;
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0,end=0;
        dp=new boolean[n][n];
        for(int len=0;len<n;len++){
            for(int i=0;i+len<n;i++){
                if(len>(end-start) && isPalindrome(s,i,i+len)){
                    start=i;
                    end=i+len;
                }
            }
        }
        return s.substring(start,end+1);
    }
    public boolean isPalindrome(String s,int start,int end){
        if(end-start<2 && s.charAt(start)==s.charAt(end)) return true;
        dp[start][end]=(s.charAt(start)==s.charAt(end) && isPalindrome(s,start+1,end-1));
        return dp[start][end];
    }
}
