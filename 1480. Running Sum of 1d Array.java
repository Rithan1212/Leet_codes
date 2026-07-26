class Solution {
    public int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        int sum=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<=i; j++){
                array[i] += nums[j];
            }
        }
        return array;
    }
}
