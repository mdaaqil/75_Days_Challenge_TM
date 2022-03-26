class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int low = 0, high = nums.length-1;
        int res[] = new int[len];
        for(int i=len-1; i>=0; i--)
        {
            if(Math.abs(nums[low]) < Math.abs(nums[high]))
            {
                res[i] = nums[high] * nums[high];
                high--;
            }
            else
            {
                res[i] = nums[low] * nums[low];
                low++;
            }
        }
        return res;
    }
}
