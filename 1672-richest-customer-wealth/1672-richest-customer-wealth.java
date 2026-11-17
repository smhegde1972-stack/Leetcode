class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=0;j<m;j++){
                 k+=accounts[i][j];                   
                }
                 if(k>max){
                    max=k;
                    }
            }
        return max;
    }
}