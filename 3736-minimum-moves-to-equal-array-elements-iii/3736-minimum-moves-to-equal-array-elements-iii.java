class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            int temp=max-nums[i];
            ans+=temp;
        }
        return ans;
    }
}