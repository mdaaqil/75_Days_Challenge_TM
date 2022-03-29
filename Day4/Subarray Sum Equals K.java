class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum = 0, count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currSum += nums[i];
            if(currSum == k)
                count += 1;
            if(map.containsKey(currSum-k))
                count += map.get(currSum-k);
            if(map.containsKey(currSum))
                map.put(currSum, map.get(currSum)+1);
            else
                map.put(currSum, 1);
        }
        return count;
    }
}
