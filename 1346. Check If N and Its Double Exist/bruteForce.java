class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]*2);
            list2.add(arr[i]);
        }
        for(int i=0;i<list2.size();i++){
            list.remove(i);
            if(list.contains(list2.get(i))){
                System.out.print(arr[i]);
                return true;
            }
            list.add(i,list2.get(i)*2);
        }
        return false;

    }
}
