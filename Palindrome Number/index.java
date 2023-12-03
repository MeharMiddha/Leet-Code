bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    else{
        int a=x;
        long rev = 0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
