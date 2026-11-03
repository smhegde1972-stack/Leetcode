class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sup = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(sup.contains(nums[i])){
                return true;
            }
            else sup.add(nums[i]);
        }
        return false;
    }
}