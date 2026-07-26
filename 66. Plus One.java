class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = digits.length - 1; i >= 0; i--) {
            int r = digits[i];
            int sum = r + carry;
            list.add(0,sum % 10);
            carry = sum / 10;
            
        }
        if(carry > 0) list.add(0,carry);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
