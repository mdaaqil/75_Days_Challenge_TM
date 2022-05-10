class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        
        Stack<Integer> stack = new Stack<>();
        
        int maxArea = 0;
        
        int left[] = new int[len];
        int right[] = new int[len];
        
        for(int i = 0; i < len; i++)
        {
            if(stack.isEmpty())
            {
                left[i] = 0;
                stack.push(i);
            }
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }
        stack.clear();
        for(int i = len - 1; i >= 0; i--)
        {
            if(stack.isEmpty())
            {
                right[i] = len - 1;
                stack.push(i);
            }
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            right[i] = stack.isEmpty() ? len - 1 : stack.peek() - 1;
            stack.push(i);
        }
        for(int i = 0; i < len; i++)
        {
            maxArea = Math.max(maxArea, ((right[i] - left[i] + 1) * heights[i]));
        }
        return maxArea;
    }
}
