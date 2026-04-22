class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length != Arrays.stream(nums).distinct().count()){
            return true;
        }
        return false;
    }
}