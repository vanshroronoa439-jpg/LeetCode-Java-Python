class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        int len=s.length();
        StringBuilder st=new StringBuilder();
        StringBuilder revword=new StringBuilder();
        for(int i=0;i<len;i++){
            String c=String.valueOf(s.charAt(i));
            if(!c.equals(" ")){
                st.append(c);
            }
            else{
                revword.insert(0,st);
                if(st.length()>0){
                    revword.insert(0," ");
                }
                st.setLength(0);
            }
        }
        String result= revword.toString();
        result = result.trim();
        return(result);
    }
}