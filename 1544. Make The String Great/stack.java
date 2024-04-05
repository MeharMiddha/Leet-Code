class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        st.push(s.charAt(0));
        char[] arr=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && (st.peek()-arr[i]==32 || st.peek()-arr[i]==-32)) st.pop();
            else st.push(arr[i]);
        }
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}
