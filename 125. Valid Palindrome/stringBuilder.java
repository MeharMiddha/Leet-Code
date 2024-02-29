class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char a = Character.toLowerCase(s.charAt(i));
                str=str+a;
            }
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString())){
            return true;
        }else{
            return false;
        }
    }
}
