class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length,j=0;
        if(len==0){
            return("");
        }
        if(len==1){
            return(strs[0]);
        }
        String s=strs[0];
        StringBuilder st=new StringBuilder();
        int len2=s.length();
        for(int i=1;i<len;i++){
            if(j>=strs[i].length() || j>=len2){
                break;
            }
            char c=s.charAt(j);
            char c2=strs[i].charAt(j);
            if(c!=c2){
                break;
            }
            if(i==len-1){
                st.append(c);
                j++;
                i=0;
            }

        }
        return(st.toString());
    }
}