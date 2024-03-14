class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(String email:emails){
            int currIdx = email.indexOf("@");
            int Idx = email.indexOf("+");
            String str1="";
            if(Idx>=0) str1=email.substring(0,Idx);
            else str1=email.substring(0,currIdx);
            str1=str1.replace(".","")+email.substring(currIdx);
            if(set.add(str1)) count++;
        }
        return count;
    }
}
