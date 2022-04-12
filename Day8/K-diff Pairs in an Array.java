class Solution {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        if(k < 0) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums)
        {
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        for(int n : map.keySet())
        {
            if(k == 0 && map.get(n) > 1 || k > 0 && map.containsKey(n + k))
                res++;
        }
        return res;
    }
}
