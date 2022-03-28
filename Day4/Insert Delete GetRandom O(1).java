class RandomizedSet {
    List<Integer> nums;
    HashMap<Integer, Integer> map;
    Random rand;

    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        map.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int currValIdx = map.get(val);
        int lastIdx = nums.size()-1;
        if(currValIdx != lastIdx)
        {
            int lastVal = nums.get(lastIdx);
            nums.set(currValIdx, lastVal);
            map.put(lastVal, currValIdx);
        }
        nums.remove(lastIdx);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
