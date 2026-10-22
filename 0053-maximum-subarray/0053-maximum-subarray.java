class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int sum=0;
        int currsum=Integer.MIN_VALUE;   
          while(i<nums.length){
          sum = Math.max(nums[i], sum + nums[i]);
            if(sum>currsum){
               currsum=sum;    
            }
        i++;
          }
          return currsum;
          }
    }
