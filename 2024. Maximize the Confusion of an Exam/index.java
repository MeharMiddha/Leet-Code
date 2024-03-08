class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int size=answerKey.length(),left=0,ans=0,cnt=0;
        for(int i=0;i<size;i++){
            if(answerKey.charAt(i)=='F'){
                cnt++;
            }
            while(cnt>k){
                if(answerKey.charAt(left)=='F'){
                    cnt--;
                }
                left++;
            }
            ans=Math.max(i-left+1,ans);
        }
        cnt=0;left=0;
        for(int i=0;i<size;i++){
            if(answerKey.charAt(i)=='T'){
                cnt++;
            }
            while(cnt>k){
                if(answerKey.charAt(left)=='T'){
                    cnt--;
                }
                left++;
            }
            ans=Math.max(i-left+1,ans);
        }
        return ans;
    }
}
