class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-9;i++){
            String dna = s.substring(i,i+10);
            map.put(dna,map.getOrDefault(dna,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}
