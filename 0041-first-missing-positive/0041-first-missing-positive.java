class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> Sup=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Sup.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(Sup.contains(i)){
                continue;
            }
            else return i;
        }
        return nums.length+1;       
    }
}