class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res[] = new int[2];
        for(int i=0; i<len ; i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                res[0] = hm.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}
