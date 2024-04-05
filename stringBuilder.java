class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length()-1){
            char a = sb.charAt(i);
            char b = sb.charAt(i+1);
            if(a==b-32 || b==a-32){
                sb.delete(i,i+2);
                i=Math.max(i-1,0);
            }else {i++;}
        }
        return sb.toString();
    }
}
