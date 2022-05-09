class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        
        if(len == 0)
            return 0;
        
        int left[] = new int[len];
        int right[] = new int[len];
        
        int LMin = prices[0], RMax = prices[len - 1];
        
        for(int i = 1; i < len; i++)
        {
            LMin = Math.min(LMin, prices[i]);
            left[i - 1] = Math.max(left[i - 1], prices[i] - LMin);
        }
        
        for(int i = len - 2; i >= 0; i--)
        {
            RMax = Math.max(RMax, prices[i]);
            right[i] = Math.max(right[i + 1], RMax - prices[i]);
        }
        
        int profit = right[0];
        for(int i = 1; i < len; i++)
        {
            profit = Math.max(profit, left[i - 1] + right[i]);
        }
        
        return profit;
    }
}
