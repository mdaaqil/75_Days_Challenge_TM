class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count[] = new int[60];
        for(int num : time) count[num % 60]++;
        int res = 0;
        for(int i = 1; i < 30; i++) res += count[i] * count[60 - i];
        
        for(int i = 1; i < count[0]; i++) res += count[0] - i;
        for(int i = 1; i < count[30]; i++) res += count[30] - i;
        
        return res;
    }
}
