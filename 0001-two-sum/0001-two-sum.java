class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevNumbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(prevNumbers.containsKey(complement)){
                int[] twoSumNumbers = {prevNumbers.get(complement), i};
                return twoSumNumbers;
            }
            prevNumbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}