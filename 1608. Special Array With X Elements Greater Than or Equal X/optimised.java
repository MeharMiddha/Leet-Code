class Solution {
    public int specialArray(int[] nums) {
        int x = 0;
        while (x <= nums.length){
            int y = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] >= x) y++;
            }
            if(x == y) return x;
            else x++;
        }
        return -1;
    }
}
