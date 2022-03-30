class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       
        int top = 0, bottom = matrix.length - 1, 
        left = 0, right = matrix[0].length - 1;
        
        List<Integer> res = new ArrayList<>();
        
        int dir = 0;
        
        while(top <= bottom && left <= right)
        {
            if(dir == 0) // diff column & left to right
            {
                for(int i = left; i <= right; i++) res.add(matrix[top][i]);
                top ++;
            }
            else if(dir == 1) // same column & top to bottom
            {
                for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
                right--;
            }
            else if(dir == 2) // diff column & right to left
            {
                for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
                bottom--;
            }
            else if (dir == 3) // same column & bottom to top
            {
                for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
                left++;
            }
            dir = (dir+1) % 4;
        }
        return res;
    }
}
