class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        
        for(int i = 0; i < len; i++)
        {
            if(nums[i] < 0)
                nums[i] = 0;
        }
        for(int i = 0; i < len; i++)
        {
            int val = Math.abs(nums[i]);
            if(val >= 1 && val <= len)
            {
                if(nums[val - 1] > 0)
                    nums[val - 1] *= -1;
                else if (nums[val - 1] == 0)
                    nums[val - 1] = -1 * (len + 1);
            }
        }
    
        for(int i = 1; i <= len; i++)
        {
            if(nums[i - 1] >= 0)
                return i;
        }
        return len + 1;
    }
}
