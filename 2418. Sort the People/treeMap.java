class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String [] res=new String [names.length];
        ArrayList<String> li= new ArrayList<>();
        TreeMap<Integer,String> hm= new TreeMap<>();

        for(int i=0;i<heights.length;i++)      
            hm.put(heights[i],names[i]);
     
        for (String value : hm.values()) 
           li.add(value);

        Collections.reverse(li);

        for(int i=0;i<li.size();i++)
             res[i]=li.get(i);

    return res;
    }
}
