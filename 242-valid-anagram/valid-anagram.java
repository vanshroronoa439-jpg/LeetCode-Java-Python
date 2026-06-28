class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder st=new StringBuilder(s);
        if(s.length()!=t.length()){
            return(false);
        }
        for(int i=0;i<t.length();i++){
            String ch=String.valueOf(t.charAt(i));
            int index=st.indexOf(ch);
            if(index<0){
                return(false);
            }
            else{
                st.deleteCharAt(index);
            }
        }
        return(true);
    }
}