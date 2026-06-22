class Solution {
    public int maxNumberOfBalloons(String text) {
        StringBuilder s=new StringBuilder(text);
        int count=0;
        StringBuilder st=new StringBuilder("balloon");
        for(int i=0;i<s.length();i++){
            String c=String.valueOf(s.charAt(i));
            int index=st.indexOf(c);
            if(index>=0){
                s.deleteCharAt(i);
                st.deleteCharAt(index);
                i--;
            }
            if(st.length()==0){
                count++;
                i=-1;
                st.append("balloon");
            }
        }
        return(count);
    }
}