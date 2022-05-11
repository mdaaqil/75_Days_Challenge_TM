import java.util.*;
class RandomizedCollection {
    ArrayList<Integer> lst;
    HashMap<Integer, Set<Integer>> idx;
    Random rand = new Random();
    
    public RandomizedCollection() {
        lst = new ArrayList<>();
        idx = new HashMap<Integer, Set<Integer>>();
    }
    
    public boolean insert(int val) {
        if(!idx.containsKey(val)) idx.put(val, new LinkedHashSet<Integer>());
        
        idx.get(val).add(lst.size());
        lst.add(val);
        return idx.get(val).size() == 1;
    }
    
    public boolean remove(int val) {
        if(!idx.containsKey(val) || idx.get(val).size() == 0) return false;
        
        int remove_idx = idx.get(val).iterator().next();
        
        idx.get(val).remove(remove_idx);
        int last = lst.get(lst.size() - 1);
        lst.set(remove_idx, last);
        idx.get(last).add(remove_idx);
        idx.get(last).remove(lst.size() - 1);
        
        lst.remove(lst.size() - 1);
        
        return true;
    }
    
    public int getRandom() {
        return lst.get(rand.nextInt(lst.size()));
    }
}
