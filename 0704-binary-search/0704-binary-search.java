class Solution {
    public int search(int[] nums, int target) {
        return searchRecursion(nums, target, nums.length - 1, 0);
    }
    
    private int searchRecursion(int[] nums, int target, int maximum, int minimum){
        int middle = minimum + (maximum - minimum) / 2;
        if (maximum >= minimum){
            if (nums[middle] == target){
                return middle;
            } else if (nums[middle] > target){
                return searchRecursion(nums, target, middle - 1, minimum);
            } else if (nums[middle] < target){
                return searchRecursion(nums, target, maximum, middle + 1);
            }
        }
        
        return -1;
    }
}