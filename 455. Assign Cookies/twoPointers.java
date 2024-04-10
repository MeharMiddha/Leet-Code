class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int bache = 0;
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                bache++;i++;
            }
            j++;
        }
        return bache;
    }
}
