class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        if(nums.length==1) return true;
      for(int i=0;i<nums.length;i++){
        if(i==0 && nums[i]==0) return false;
        if(i>max) return false;
        if(i+nums[i]>max){
            max=i+nums[i];
        }
      }
        if(max>=nums.length-1) return true;
        return false;
    }
}