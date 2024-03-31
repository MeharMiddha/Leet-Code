class Solution {
    public int reverse(int x) {
        int a =x;
        long rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==(int)rev){
            return (int)rev;
        }else{
            return 0;
        }
    }
}
