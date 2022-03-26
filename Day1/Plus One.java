
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1;
        for(int i=len-1; i>=0; i--)
        {
            int sum = digits[i] + carry;
            res.add(0, sum % 10);
            carry = sum / 10;
        }
        if(carry != 0)
        {
            res.add(0, carry);
        }
        int[] result = res.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
