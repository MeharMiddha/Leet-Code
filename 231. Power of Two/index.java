class Solution {

    public static boolean check(int n,int x){
        if(n==2 && n%2==0 && x%2==0){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return check(n/2,x);
    }

    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        int x=n;
        return check(n,x);

    }
}
