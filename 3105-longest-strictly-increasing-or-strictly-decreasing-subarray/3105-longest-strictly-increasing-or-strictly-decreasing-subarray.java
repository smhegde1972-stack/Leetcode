class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count1 =1;
        int count2=1;
        int i=0;
        int j=1;
        int max=1;
        while(j<nums.length){
            if(nums[i]>nums[j]){
                count1++;
                i++;
                j++;
                if(count1>max){
                    max=count1;
                }
                count2=1;    
            }
            else if(nums[i]<nums[j]){
                count2++;
                i++;
                j++;
                if(count2>max){
                    max=count2;
                }
                count1=1;
                }
                else if(nums[i]==nums[j]){
                    i++;
                    j++;
                    count1=1;
                    count2=1;
                }

            }
        return max;
        }
        
    }