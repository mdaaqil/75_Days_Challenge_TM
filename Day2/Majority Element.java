class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(int n : nums)
        {
            if(count == 0)
                res = n;
            count += res != n ? -1 : 1;
        }
        return res;
    }
}
