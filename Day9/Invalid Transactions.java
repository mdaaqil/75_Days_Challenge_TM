class Solution {
    class Transaction
    {
        String name, city;
        int time, amount;
        public Transaction(String line)
        {
            String str[] = line.split(",");
            name = str[0];
            time = Integer.parseInt(str[1]);
            amount = Integer.parseInt(str[2]);
            city = str[3];
        }
    }
    public List<String> invalidTransactions(String[] transactions) {
        List<String> result = new ArrayList<>();
        HashMap<String, List<Transaction>> map = new HashMap<>();
        
        for(String t : transactions)
        {
            Transaction trans = new Transaction(t);
            map.putIfAbsent(trans.name, new ArrayList<>());
            map.get(trans.name).add(trans);
        }
        
        for(String t : transactions)
        {
            Transaction trans = new Transaction(t);
            if(!isValid(trans, map.getOrDefault(trans.name, new ArrayList<>())))
                result.add(t);
        }
        return result;
    }
    
    public boolean isValid(Transaction t, List<Transaction> list)
    {
        if(t.amount > 1000) return false;
        for(Transaction ta : list)
        {
            if(Math.abs(t.time - ta.time) <= 60 && !ta.city.equals(t.city))
                return false;
        }
        return true;
    }
}
