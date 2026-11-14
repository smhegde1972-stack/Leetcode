class Solution {
    public int[] getConcatenation(int[] nums){
        int k=nums.length;
       int  n=2*k;
        int j=0;
        int [] arr=new int[n];
         for(int i=0;i<k;i++){
            arr[i]=nums[i];  
         }
         for(int i=k;i<n;i++){
            arr[i]=nums[j];
            j++;           
        }
        return arr;
        
        
    }
}