class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int l = 0, r = len - k;
        int total = 0;
        for(int i = r ; i < len; i++)
            total += cardPoints[i];
        int res = total;
        while(r < len)
        {
            total += (cardPoints[l] - cardPoints[r]);
            res = Math.max(res, total);
            l++; 
            r++;
        }
        return res;
    }
}
