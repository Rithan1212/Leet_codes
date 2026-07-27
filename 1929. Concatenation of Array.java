class Solution {
    public int[] getConcatenation(int[] nums) {
      int [] num1=new int [nums.length*2];
       for (int i=0;i<nums.length;i++){
           num1[i]=nums[i];
           num1[i+nums.length]=nums[i];
       }
    return num1;
    }
}
