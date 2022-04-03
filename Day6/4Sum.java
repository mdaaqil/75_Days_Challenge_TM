class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int target2 = target - nums[i] - nums[j];
                int l = j + 1, r = n - 1;
                while(l < r)
                {
                    int sum = nums[l] + nums[r];
                    if(sum < target2) l++;
                    else if(sum > target2) r--;
                    else
                    {
                         List<Integer> temp = new ArrayList<>();
                         temp.add(nums[i]);
                         temp.add(nums[j]);
                         temp.add(nums[l]);
                         temp.add(nums[r]);
                         res.add(temp);
                         
                         while(l < r && nums[l] == temp.get(2)) l++;
                         while(l < r && nums[r] == temp.get(3)) r--;
                    }
                }
                while(j + 1 < n && nums[j] == nums[j+1]) j++;
            }
            while(i + 1 < n && nums[i] == nums[i+1]) i++;
        }
        return res;
    }
}
