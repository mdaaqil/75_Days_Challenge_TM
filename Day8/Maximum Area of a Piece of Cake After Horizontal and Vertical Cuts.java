class Solution {
    final int mod = (int) (1e9 + 7);
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
       
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long hmax = horizontalCuts[0];
        for(int i = 1; i < horizontalCuts.length; i++)
        {
            hmax = Math.max(horizontalCuts[i] - horizontalCuts[i-1], hmax);
        }
        if(hmax < h - horizontalCuts[horizontalCuts.length - 1])
            hmax = h - horizontalCuts[horizontalCuts.length - 1];

        long vmax = verticalCuts[0];
        for(int i = 1; i < verticalCuts.length; i++)
        {
            vmax = Math.max(verticalCuts[i] - verticalCuts[i-1], vmax);
        }
        if(vmax < w - verticalCuts[verticalCuts.length - 1])
            vmax = w - verticalCuts[verticalCuts.length - 1];
        
        long res = (hmax * vmax) % mod;
        return (int) res;
    }
}
