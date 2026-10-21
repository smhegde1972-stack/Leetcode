class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0;
        int j=1;
        int max=0;
        int m=0;
        for(int z=0;z<arr.length;z++){
            if(arr[z]>max){
                max=arr[z];
                 m=z;
            }
        }
        if(max==arr[0]|| max==arr[arr.length-1]) return false;
        while(i<m){
            if(arr[i]==arr[j]){
                return false;
            }
            else  if (arr[i]<arr[j]){
                i++;
                j++;
            }else return false;

        }
        j=m+1;
         while(m<arr.length-1){
            if(arr[m]==arr[j]){
                return false;
            }
            else  if (arr[m]>arr[j]){
                m++;
                j++;
            }else return false;
         }
         return true;    
    }
}