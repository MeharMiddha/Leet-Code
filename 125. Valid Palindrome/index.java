class Solution {

    public boolean check(int i,int j,String str){
        if(i>=j) return true;
        if(str.charAt(i)!=str.charAt(j)) return false;
        else return check(i+1,j-1,str);
    }

    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                char a = Character.toLowerCase(s.charAt(i));
                str=str+a;
            }
        }
        int i=0;
        int j=str.length()-1;
        return check(i,j,str);
    }
}
