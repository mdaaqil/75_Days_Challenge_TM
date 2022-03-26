class Solution {
    public int maxProfit(int[] prices) {
        int res = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] < res)
                res = prices[i];
            max = Math.max(max, prices[i]-res);
        }
        return max;
    }
}
