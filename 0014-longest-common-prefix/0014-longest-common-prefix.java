class Solution {
    public String longestCommonPrefix(String[] strs) {
int n=strs[0].length();
boolean kaka=true;
String s="";
     for(int i=0;i<n;i++){
        kaka=true;
        for(int j=1;j<strs.length;j++){
            if (i >= strs[j].length()) {
            kaka = false;
            break;
            }
            else if(strs[0].charAt(i)==strs[j].charAt(i) ){
                kaka=true;
        }
        else {
            kaka=false; break;
        }
        }
        if(kaka)  s+=strs[0].charAt(i);
        else return s;
     }
     return s;        
    }
}