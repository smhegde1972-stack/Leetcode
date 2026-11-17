class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            int k=sentences[i].split(" ").length;
            if(k>count){
                count=k;
            }
        }
        return count;
    }
}
