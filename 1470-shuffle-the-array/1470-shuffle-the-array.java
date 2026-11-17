class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr= new int[2*n];
        int j=0;
        int i=0;
     while(j<n){
            if(i%2==0){
                arr[i]=nums[j];
                j++;
            }
            i++;
        }
        i=0;
        while(j<2*n){
            if(i%2!=0){
                arr[i]=nums[j];
                j++;
            }
            i++;
        }
        return arr;
        
    }
}