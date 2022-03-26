class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int inc = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
                nums[inc++] = nums[i];
            else
                zeros++;
        }
        while(inc<nums.length)
            nums[inc++] = 0;
    }
}
