class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length * 2];
        for(int i = 0; i < array.length; i++){
            array[i] = nums[i % nums.length];
        }
        return array;
    }
}