class Solution {

    public static void reverse(int i,int j,char[] s){
        if(i>j) return;
        char a=s[i];
        s[i]=s[j];
        s[j]=a;
        i++;j--;
        reverse(i,j,s);
    }

    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        reverse(i,j,s);
    }
}
