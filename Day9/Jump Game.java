class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int reachable = 0;
        for(int i = 0; i < len; i++)
        {
            if(reachable < i) return false;
            reachable = Math.max(reachable, nums[i] + i);
        }
        return true;
    }
}
