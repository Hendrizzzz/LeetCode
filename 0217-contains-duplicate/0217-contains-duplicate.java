class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int num : nums){
            if(!map.add(num)) return true;
        }
        return false;
    }
}
