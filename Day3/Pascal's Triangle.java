class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();  
            row.add(1);
            for(int j = 1; j < i; j++)
            {
                int left = result.get(i-1).get(j-1);
                int right = result.get(i-1).get(j);
                row.add(left+right);
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
