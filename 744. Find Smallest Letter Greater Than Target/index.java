class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                ans=letters[i];
                break;
            }
        }
        return ans;
    }
}
